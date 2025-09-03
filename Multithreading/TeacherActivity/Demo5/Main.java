class Bank {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " → Not enough balance");
        }
    }
}

class Customer extends Thread {
    Bank bank;
    int amount;

    Customer(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        Customer c1 = new Customer(b, 70);
        Customer c2 = new Customer(b, 50);

        c1.start();
        c2.start();
    }
}
