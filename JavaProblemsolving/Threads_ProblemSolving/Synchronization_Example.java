package JavaProblemsolving.Threads_ProblemSolving;

class Synchronization_Example {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void simulateDeadlock() {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " lock lock1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }

                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " lock lock2");
                }
            }
        }, "Deadlock-Thread-1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " lock lock2");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }

                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + " lock lock1");
                }
            }
        }, "Deadlock-Thread-2");

        thread1.start();
        thread2.start();
    }

    public void preventDeadlock() {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " lock lock1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }

                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " lock lock2");
                }
            }
        }, "NoDeadlock-Thread-1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " locked lock1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }

                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " locked lock2");
                }
            }
        }, "NoDeadlock-Thread-2");

        thread1.start();
        thread2.start();
    }

    public void threadPriorityExample() {
        Thread lowPriority = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "Priority:" + Thread.currentThread().getPriority());
        }, "Low-Priority");

        Thread highPriority = new Thread(() -> {
            System.out
                    .println(Thread.currentThread().getName() + "Priority:" + Thread.currentThread().getPriority());
        }, "High-Priority");

        lowPriority.setPriority(Thread.MIN_PRIORITY);
        highPriority.setPriority(Thread.MAX_PRIORITY);

        lowPriority.start();
        highPriority.start();
    }

    public static void main(String[] args) {
        Synchronization_Example demo = new Synchronization_Example();

        System.out.println("Simulating Deadlock");
        demo.simulateDeadlock();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println("Preventing Deadlock");
        demo.preventDeadlock();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread Priority Example");
        demo.threadPriorityExample();
    }
}
