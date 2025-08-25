class BankAccount {
    int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}

class DepositThread extends Thread {
    BankAccount account;
    DepositThread(BankAccount account) { this.account = account; }
    public void run() { account.deposit(500); }
}

class WithdrawThread extends Thread {
    BankAccount account;
    WithdrawThread(BankAccount account) { this.account = account; }
    public void run() { account.withdraw(700); }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new DepositThread(account);
        Thread t2 = new WithdrawThread(account);
        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
