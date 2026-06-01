class BankAccount {

    // Private data
    private double balance;

    // Setter
    public void setBalance(double amount) {
        balance = amount;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double money) {
        balance += money;
    }

    // Withdraw method
    public void withdraw(double money) {
        if (money <= balance) {
            balance -= money;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setBalance(5000);

        acc.deposit(2000);
        acc.withdraw(1000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}