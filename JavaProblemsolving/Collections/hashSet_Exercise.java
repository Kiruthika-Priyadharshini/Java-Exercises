package JavaProblemsolving.Collections;

import java.util.*;

public class hashSet_Exercise {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "E", "F"));
        System.out.println(set1);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);

        System.out.println("LinkedHashSet");

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("A");
        linkedSet.add("B");
        linkedSet.add("C");
        linkedSet.add("D");

        System.out.println(linkedSet);

    }
}
