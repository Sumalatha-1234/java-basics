//Implement producer-consumer synchronization where one thread produces data
// and another consumes it.
import java.util.LinkedList;

class Buffer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }
        list.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait();
        }
        int val = list.removeFirst();
        System.out.println("Consumed: " + val);
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    buffer.produce(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}

