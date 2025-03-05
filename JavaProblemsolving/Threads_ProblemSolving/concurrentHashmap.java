package JavaProblemsolving.Threads_ProblemSolving;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Thread writerThread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("Thread1-Key" + i, i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread writerThread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("Thread2-Key" + i, i * 10);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writerThread1.start();
        writerThread2.start();

        try {
            writerThread1.join();
            writerThread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Map Content: " + map.toString());
    }

}
