package JavaProblemsolving.Collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetExample {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30));

        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        System.out.println(numbers);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);

    }
}
