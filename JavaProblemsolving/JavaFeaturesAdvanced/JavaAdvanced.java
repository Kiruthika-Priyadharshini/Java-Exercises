package JavaProblemsolving.JavaFeaturesAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.time.*;

interface InterfaceA {
    default void helloDefault() {
        System.out.println("Hello, I am in default method");
    }
}

@FunctionalInterface
interface Calculator {
    int Operation(int a, int b);
}

public class JavaAdvanced implements InterfaceA {

    public static void methodReferenceExample() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        list1.forEach(System.out::println);
    }

    public static void optionalExample() {
        List<Integer> list1 = Arrays.asList(1, null, 2, 3, 4, 5, 6);

        Optional<Integer> op = Optional.ofNullable(list1.get(1));

        op.ifPresentOrElse(val -> System.out.println(val), () -> System.out.println("no value found"));
        Integer defaultVal = op.orElse(0);
        System.out.println(defaultVal);
    }

    public static void StreamExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfSquareOfEvenNumbers = numbers.stream().filter(i -> i % 2 == 0).map(i -> i * i).reduce(0,
                (x, y) -> x + y);

        System.out.println("Sum of squares of even numbers" + sumOfSquareOfEvenNumbers);
    }

    public static void dateTimeExample() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date" + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current Date and Time:" + currentDateAndTime);
    }

    public static void stringMethods() {
        String name = "      Kiruthika \nPriyadharshini \nElamurugan     ";
        System.out.println(name.strip());
        // name.lines().forEach(System.out::println);
        System.out.println(name.lines().count());
        System.out.println(name.repeat(3));

    }

    public static void main(String[] args) {
        methodReferenceExample();

        InterfaceA a = new JavaAdvanced();
        a.helloDefault();

        optionalExample();
        StreamExample();
        dateTimeExample();

        List<Employee> employees = Arrays.asList(
                new Employee("Kiru", 26, 80000),
                new Employee("Priya", 26, 70000),
                new Employee("Dharshini", 21, 60000));

        employees.sort((e1, e2) -> Integer.compare(e1.salary, e2.salary));
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        employees.forEach(System.out::println);

        Calculator add = (i, j) -> i + j;

        Calculator multiply = (i, j) -> i * j;

        System.out.println(add.Operation(1, 4));
        System.out.println(multiply.Operation(7, 8));

        stringMethods();

        Map<Integer, List<Employee>> groupbyAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("----grouping by age---");
        groupbyAge.forEach((age, group) -> System.out.println(age + "-> " + group));

        Map<Boolean, List<Employee>> partitionByAge = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() % 2 == 0));
        System.out.println("-----partionby age group----");
        partitionByAge.forEach((isEven, group) -> System.out.println(isEven + "->" + group));

        partitionByAge.forEach((isEven, group) -> {
            String ageType = isEven ? "evenAge" : "oddAge";
            System.out.println(ageType + "->" + group);
        });

    }
}
