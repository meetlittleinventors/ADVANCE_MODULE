public class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Message " + i);
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}
