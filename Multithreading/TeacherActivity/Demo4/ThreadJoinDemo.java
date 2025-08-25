class JoinDemo extends Thread {
    String name;
    JoinDemo(String name) { this.name = name; }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(name + " running " + i);
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1 = new JoinDemo("Thread 1");
        JoinDemo t2 = new JoinDemo("Thread 2");

        t1.start();
        t1.join(); // Wait for t1 to finish
        t2.start();
    }
}
