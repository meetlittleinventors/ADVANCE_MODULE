class SleepDemo extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Sleeping thread: " + i);
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}
