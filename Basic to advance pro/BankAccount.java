class BankAccount {

    private String name;
    private double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Sai", 5000);

        account.showBalance();

        account.deposit(2000);
        account.withdraw(1500);

        account.showBalance();
    }
}