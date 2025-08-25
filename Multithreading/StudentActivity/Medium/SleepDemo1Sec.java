class Sleep1SecThread extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Count: " + i);
            try { Thread.sleep(1000); } catch(InterruptedException e) {}
        }
    }
}

public class SleepDemo1Sec {
    public static void main(String[] args) {
        Sleep1SecThread t = new Sleep1SecThread();
        t.start();
    }
}
