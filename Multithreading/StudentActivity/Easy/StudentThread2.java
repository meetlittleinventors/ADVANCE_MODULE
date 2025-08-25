class NumberRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class StudentThread2 {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberRunnable());
        t.start();
    }
}
