class NumberThread extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println(i);
            try { Thread.sleep(1000); } catch(InterruptedException e) {}
        }
    }
}

public class HomeEasy {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}
