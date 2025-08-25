class Ping extends Thread {
    public void run() {
        for(int i=0;i<5;i++) System.out.println("Ping");
    }
}

class Pong extends Thread {
    public void run() {
        for(int i=0;i<5;i++) System.out.println("Pong");
    }
}

public class PingPongDemo {
    public static void main(String[] args) {
        Thread t1 = new Ping();
        Thread t2 = new Pong();
        t1.start();
        t2.start();
    }
}
