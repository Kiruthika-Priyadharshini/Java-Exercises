package JavaProblemsolving.Threads_ProblemSolving;

public class ThreadsExamples implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + "thread going to sleep");
            Thread.sleep(1000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

    }

    public static void threadJoin() {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 Started");
            try {
                Thread.sleep(200);
                System.out.println("Thread 1 Completed");
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        });
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 Started");
            try {
                Thread.sleep(2000);
                System.out.println("Thread 2 Completed");
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        });
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Both threads finished execution.");
    }

}

class ThreadsExamplesMain {
    public static void main(String[] args) {
        ThreadsExamples example1 = new ThreadsExamples();
        Thread t = new Thread(example1);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        example1.threadJoin();

    }
}
