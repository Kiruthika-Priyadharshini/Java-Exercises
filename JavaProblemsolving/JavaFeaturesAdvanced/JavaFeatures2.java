package JavaProblemsolving.JavaFeaturesAdvanced;

import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaFeatures2 {
    public static void parallelStream() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11);

        long startTime = System.currentTimeMillis();
        int sumSequential = numbers.stream().reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential: " + sumSequential + "Time Taken: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        int sumParallel = numbers.parallelStream().reduce(0, Integer::sum);
        endTime = System.currentTimeMillis();
        System.out.println("Parallel: " + sumParallel + "Time Taken: " + (endTime - startTime));
    }

    public static void sortVsParralellSort() {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11 };
        long startTime = System.nanoTime();
        Arrays.sort(numbers);
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime));

        startTime = System.nanoTime();
        Arrays.parallelSort(numbers);
        endTime = System.nanoTime();
        System.out.println((endTime - startTime));
    }

    public static void EnhancedMapMethods() {
        Map<String, Employee> employeeMap = new HashMap<>();

        employeeMap.computeIfAbsent("Kiru", k -> new Employee("Kiru", 30, 50000));
        employeeMap.computeIfAbsent("Priya", k -> new Employee("Priya", 25, 40000));

        System.out.println("Employee Map after computeIfAbsent:");
        employeeMap.forEach((name, employee) -> System.out.println(employee));

        employeeMap.merge("Kiru", new Employee("Kiru", 30, 5000), (existingEmployee, newEmployee) -> {
            existingEmployee.setSalary(existingEmployee.getSalary() + newEmployee.getSalary());
            return existingEmployee;
        });

        employeeMap.merge("Dharshini", new Employee("Dharshini", 28, 45000),
                (existingEmployee, newEmployee) -> {
                    existingEmployee.setSalary(existingEmployee.getSalary() + newEmployee.getSalary());
                    return existingEmployee;
                });

        System.out.println("Employee Map after merge");
        employeeMap.forEach((name, employee) -> System.out.println(employee));
    }

    public static void encoderDecoder() {
        String originalString = "Kiruthika Priyadharshini E!";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        String decodedString = new String(Base64.getDecoder().decode(encodedString));

        System.out.println("Original" + originalString);
        System.out.println("Encoded" + encodedString);
        System.out.println("Decoded" + decodedString);
    }

    public static void optionalExample() {
        String[] words = { "Kiruthika", "Priyadharshini", "Elamurugan", null, "Optional" };

        Optional<String> optionalValue = Optional.ofNullable(words[2]);
        optionalValue.ifPresentOrElse(value -> System.out.println("Value:" + value),
                () -> System.out.println("No value present"));

        Optional<String> optionalNull = Optional.ofNullable(words[3]);
        optionalNull.ifPresentOrElse(value -> System.out.println("Value: " + value),
                () -> System.out.println("No value present"));
    }

    public static void javaScriptExample() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("Nashorn");

        if (engine != null) {
            try {
                String script1 = "10 + 20 * 3";
                Object result1 = engine.eval(script1);
                System.out.println("Result of JavaScript expression:" + result1);
            } catch (ScriptException e) {
                System.out.println("Script execution failed" + e.getMessage());
            }
        } else {
            System.out.println("Nashorn engine not available");
        }
    }

    public static void stampedLockExample() {
        StampedLock lock = new StampedLock();
        Runnable task = () -> {
            long stamp = lock.writeLock();
            try {
                System.out.println("Writing data...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlockWrite(stamp);
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task);
        executorService.submit(task);
        executorService.shutdown();
    }

    public static void main(String[] args) {
        parallelStream();
        sortVsParralellSort();
        EnhancedMapMethods();
        encoderDecoder();
        optionalExample();
        javaScriptExample();
        stampedLockExample();

    }
}
