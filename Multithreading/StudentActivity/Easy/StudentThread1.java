class NameThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Student Name");
        }
    }
}

public class StudentThread1 {
    public static void main(String[] args) {
        NameThread t = new NameThread();
        t.start();
    }
}
