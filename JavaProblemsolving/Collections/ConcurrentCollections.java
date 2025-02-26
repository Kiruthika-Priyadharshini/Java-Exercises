package JavaProblemsolving.Collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

//Programmer: Kiruthika Priyadharshini
//Notes: Here I tried using threads to understand the execution of threads are happening in parallel and the impace it made on the 
//CopyOnWriteArrayList and ConcurrentHashMap to understand the thread safe concept.

public class ConcurrentCollections {

    public static void main(String[] args) throws InterruptedException {

        // Create a CopyOnWriteArrayList to store a list of strings
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Employee1");
        list.add("Employee2");
        list.add("EMployee3");

        Thread thread1 = new Thread(() -> {
            for (int i = 4; i < 9; i++) {
                list.add("Employee " + i);
                System.out.println("Thread 1 added: Employee " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                if (!list.isEmpty()) {
                    String removed = list.remove(0);
                    System.out.println("Thread 2 removed Employee: " + removed);
                }
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Employee1", 1);
        map.put("Employee2", 2);
        map.put("Employee3", 3);
        Thread thread3 = new Thread(() -> {
            for (int i = 4; i < 9; i++) {
                map.put("Employee" + i, i);
                System.out.println("Thread 3 updated map: Key" + i + " -> " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.remove("Employee5");
                System.out.println("Thread 4 removed Employee5 from map");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("\nFinal List: " + list);
        System.out.println("Final Map: " + map);

    }
}
