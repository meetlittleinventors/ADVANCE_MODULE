class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " -> " + count);
    }
}

class CounterThread extends Thread {
    Counter counter;
    CounterThread(Counter counter) { this.counter = counter; }

    public void run() {
        for(int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        t1.start();
        t2.start();
    }
}
