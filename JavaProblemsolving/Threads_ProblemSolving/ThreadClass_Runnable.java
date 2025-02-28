package JavaProblemsolving.Threads_ProblemSolving;

public class ThreadClass_Runnable extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running!");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running" + Thread.currentThread().getName());
    }
}

class Main_Thread {
    public static void main(String[] args) {
        ThreadClass_Runnable t1 = new ThreadClass_Runnable();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

    }

}
