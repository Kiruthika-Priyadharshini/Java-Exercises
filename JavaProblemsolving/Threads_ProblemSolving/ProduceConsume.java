package JavaProblemsolving.Threads_ProblemSolving;

class SharedBuffer {
    private int item;
    private boolean isProduced = false;

    synchronized void produce(int item) throws InterruptedException {
        while (isProduced) {
            wait();
        }
        this.item = item;
        System.out.println("Produced: " + item);
        isProduced = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait();
        }
        System.out.println("Consumed: " + item);
        isProduced = false;
        notify();
    }
}

public class ProduceConsume {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }

}
