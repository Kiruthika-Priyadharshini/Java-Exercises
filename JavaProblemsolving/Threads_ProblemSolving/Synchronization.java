package JavaProblemsolving.Threads_ProblemSolving;

class Counter {
    public int count = 0;

    public void blockcounter() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized void synchronizedmethodcounter() {

        count++;

    }

    public void nonsyncronizedmethodcounter() {

        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.nonsyncronizedmethodcounter();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.nonsyncronizedmethodcounter();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.synchronizedmethodcounter();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.synchronizedmethodcounter();
            }
        });

        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.blockcounter();
            }
        });

        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.blockcounter();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Non syncronized threads (Expected 20000): " + counter.getCount());
        counter.count = 0;

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Synchronized Methods (Expected 20000): " + counter.getCount());
        counter.count = 0;

        t5.start();
        t6.start();

        t5.join();
        t6.join();

        System.out.println("Synchronized Blocks (Expected 20000): " + counter.getCount());

    }

}
