class ATM {

    private String name;
    private double balance;

    ATM(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount);
    }
}

public class ATMDemo {

    public static void main(String[] args) {

        ATM account = new ATM("Sai", 5000);

        account.checkBalance();

        System.out.println();

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println();

        account.checkBalance();
    }
}