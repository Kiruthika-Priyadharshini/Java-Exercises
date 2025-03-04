package JavaProblemsolving.Streams_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

interface Welcome {
    void hello(String name);
}

class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + "]";
    }

}

public class Streams_ps {
    public static int addLambda(int a, int b) {
        BiFunction<Integer, Integer, Integer> sum = (i, j) -> i + j;
        return sum.apply(a, b);
    }

    public static int fpSum(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
        return sum;
    }

    public static void functionalInterfaceExample() {
        Welcome welcome = name -> System.out.println("Hello, " + name + "!");
        welcome.hello("Kiruthika");
    }

    public static void listToStreamPrint() {
        List<String> names = Arrays.asList("Kiruthika", "Priyadharshini", "Elamurugan");
        names.stream().forEach(System.out::println);
    }

    public static void listToEvenNumbers() {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

    public static void ConvertToUpperCase() {
        List<String> names = Arrays.asList("kiru", "priya", "dharshini");
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);
    }

    public static void SumUsingReduce() {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = num.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    public static void forEachPrint() {
        List<String> c = Arrays.asList("A", "B", "C");
        c.stream().forEach(System.out::println);
    }

    public static void sortCustomObjects() {
        List<People> p = Arrays.asList(
                new People("Kiru", 26),
                new People("Priya", 22),
                new People("Elamurugan", 30));

        p.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
        p.forEach(System.out::println);
    }

    public static void collectintoList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squares);
    }

    public static void filterMapList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> squares = numbers.stream().filter(num -> num % 2 == 0).map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);
    }

    public static void main(String[] args) {
        // System.out.println();
        // List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        // System.out.println(fpSum(numbers));
        // functionalInterfaceExample();
        // listToStreamPrint();
        // listToEvenNumbers();
        // ConvertToUpperCase();
        // SumUsingReduce();
        // sortCustomObjects();
        // collectintoList();
        filterMapList();

    }

}
