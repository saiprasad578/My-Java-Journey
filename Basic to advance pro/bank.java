class bank {

    private int balance = 10000;

    // synchronized prevents multiple threads
    // from modifying the balance at the same time
    synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println(
                Thread.currentThread().getName()
                + " is withdrawing ₹" + amount
            );

            balance -= amount;

            System.out.println(
                "Remaining Balance: ₹" + balance
            );

        } else {

            System.out.println(
                Thread.currentThread().getName()
                + " - Insufficient Balance"
            );
        }
    }
}

public class BankApplication {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread user1 = new Thread(() -> {
            account.withdraw(7000);
        }, "User-1");

        Thread user2 = new Thread(() -> {
            account.withdraw(5000);
        }, "User-2");

        user1.start();
        user2.start();
    }
}