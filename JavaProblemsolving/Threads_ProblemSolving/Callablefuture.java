package JavaProblemsolving.Threads_ProblemSolving;

import java.util.concurrent.*;

class Callable1 implements Callable<Integer> {
    public Integer call() throws Exception {
        System.out.println("Computing result...");
        Thread.sleep(2000);
        return 42;
    }
}

public class Callablefuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callableTask = new Callable1();

        Future<Integer> future = executor.submit(callableTask);

        System.out.println("Task submitted, doing other work...");

        try {

            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

}
