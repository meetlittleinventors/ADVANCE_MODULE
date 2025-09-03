class Shared {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shared s = new Shared();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                s.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                s.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
