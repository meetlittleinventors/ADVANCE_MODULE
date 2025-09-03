class NumberThread extends Thread {
    private int start;
    public NumberThread(int start) { this.start = start; }

    public void run() {
        for (int i = start; i < start + 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread(1);
        NumberThread t2 = new NumberThread(6);
        t1.start();
        t2.start();
    }
}
