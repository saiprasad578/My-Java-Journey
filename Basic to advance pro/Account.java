abstract class Account {

    private String name;
    protected double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    abstract void accountType();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void showBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void accountType() {
        System.out.println("Account Type: Savings");
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Account account =
                new SavingsAccount("Sai", 5000);

        System.out.println("Name: " + account.getName());

        account.accountType();

        account.deposit(2000);

        account.showBalance();

        ((SavingsAccount) account).withdraw(3000);

        account.showBalance();
    }
}