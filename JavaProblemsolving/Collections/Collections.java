package JavaProblemsolving.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collections {
    // 1. Add an dynamic elements into a array list using for loop multiplication of
    // 5
    public void array_dynamicelements() {
        ArrayList<Integer> arr1 = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                arr1.add(i);
            }
        }
        for (int item : arr1) {
            System.out.println(item);
        }

    }
    // 2. Remove or add elements based on a index

    public void addelement(int index, int element) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        arr.add(index, element);
        System.out.println(arr.toString());

    }
    // 3. How to replace/remove a element from an array list

    public void removeElement(int index, int element) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        arr.remove(index);
        arr.remove(Integer.valueOf(element));
        System.out.println(arr.toString());

        arr.set(2, 100);
        System.out.println(arr.toString());

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 10) {
                arr.set(i, 1);
            }
        }

        System.out.println(arr.toString());

    }

    // 5. create a subarray list which has only even numbers
    public void subListArray() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> subarr = arr.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(subarr.toString());

    }

    public static void main(String[] args) {
        Collections col = new Collections();
        col.array_dynamicelements();
        col.addelement(3, 100);
        col.removeElement(2, 40);
        col.subListArray();
    }

}
