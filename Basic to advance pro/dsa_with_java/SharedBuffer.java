import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    synchronized void produce(int value) throws InterruptedException {

        while (queue.size() == capacity) {
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notify();
    }

    synchronized int consume() throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);

        notify();

        return value;
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {

                try {
                    buffer.produce(i);
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        });

        Thread consumer = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {

                try {
                    buffer.consume();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        });

        producer.start();
        consumer.start();
    }
}