class TablePrinter extends Thread {
    int num;
    TablePrinter(int num) { this.num = num; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Table of " + num + ": " + num + " x " + i + " = " + (num * i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TablePrinter t1 = new TablePrinter(2);
        TablePrinter t2 = new TablePrinter(3);

        t1.start();
        t2.start();
    }
}
