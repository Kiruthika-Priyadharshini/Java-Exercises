package JavaProblemsolving.Streams_Lambdas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {
    public static void flatMap() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<Integer> flattenedList = Stream.of(list1, list2, list3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenedList);
    }

    public static void filterObjects() {
        List<People> people = Arrays.asList(new People("Kiru", 25), new People("Priya", 30),
                new People("dharshini", 27));
        people.stream().filter(person -> person.age < 28).forEach(person -> System.out.println(person.name));
    }

    public static void parralelStreamExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Sequential Stream:");
        numbers.stream().forEach(num -> System.out.println(Thread.currentThread().getName() + ":" + num));

        System.out.println("Parallel Stream:");
        numbers.parallelStream().forEach(num -> System.out.println(Thread.currentThread().getName() + ":" + num));
    }

    public static void customCollectorExample() {
        List<String> items = Arrays.asList("kiru", "priya", "dharshini", "kiru");
        LinkedHashSet<String> collectedItems = items.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collectedItems);
    }

    public static void predicateExample() {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);
    }

    public static void consumerExample() {
        List<String> i = Arrays.asList("Kiru", "Priyadharshini", "dharshini");
        // Consumer<String> p = System.out::println;
        // i.forEach(p);
        Consumer<String> p = str -> System.out.println(str);
        i.forEach(p);
    }

    public static void supplierExample() {
        Supplier<Integer> randomSupplier = () -> ThreadLocalRandom.current().nextInt(1, 100);
        Stream.generate(randomSupplier).limit(5).forEach(System.out::println);
    }

    public static void streamStatistics() {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }

    public static void optionalExample() {
        List<Integer> numbers = Arrays.asList();
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println(min);
    }

    public static void chainingStreamOperations() {
        List<String> names = Arrays.asList("kiru", "kiruthi", "priya", "dharshini", "ela");
        List<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void main(String[] args) {
        flatMap();
        filterObjects();
        parralelStreamExample();
        consumerExample();
        customCollectorExample();
        chainingStreamOperations();
        streamStatistics();
        predicateExample();
        optionalExample();
        supplierExample();

    }

}
