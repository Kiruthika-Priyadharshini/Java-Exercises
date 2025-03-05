package JavaProblemsolving.Threads_ProblemSolving;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolorExecutors {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " is completed by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}
