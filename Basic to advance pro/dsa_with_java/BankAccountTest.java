class BankAccount {
    private int balance = 10000;
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName()
                    + " withdrawal successful");
        } 
        else {
            System.out.println(Thread.currentThread().getName()
                    + " insufficient balance");
        }
    }

    int getBalance() {
        return balance;
    }
}

public class BankAccountTest {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.withdraw(7000);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.withdraw(6000);
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}