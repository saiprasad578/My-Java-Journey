class Bank_Account {

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

public class Bank_AccountTest {
    public static void main(String[] args) {

        Bank_Account acc = new Bank_Account();

        acc.setBalance(5000);

        acc.deposit(2000);
        acc.withdraw(1000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}