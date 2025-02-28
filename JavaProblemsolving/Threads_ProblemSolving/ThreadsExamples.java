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
        Thread t1 = new Thread(() -> System.out.println("Thread 1 running"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2 running"));

        t1.start();
        t2.start();

        try {
            t1.join();
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

    }
}
