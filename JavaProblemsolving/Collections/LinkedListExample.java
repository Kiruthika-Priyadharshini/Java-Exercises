package JavaProblemsolving.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Kiruthika");
        linkedList.add("Keerthi");
        linkedList.add("kiruthi");
        linkedList.add("kiru");
        linkedList.add("keee");

        System.out.println(linkedList);

        linkedList.addFirst("priya");
        linkedList.addLast("dharshini");
        System.out.println(linkedList);

        System.out.println("removing element");
        linkedList.remove("keee");
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        for (String names : linkedList) {
            System.out.println(names);
        }

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
