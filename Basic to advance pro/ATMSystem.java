import java.util.Scanner;

class Account {
    private String accountHolder;
    private double balance;
    private int pin;

    public Account(String accountHolder, double balance, int pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void checkBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Holder : " + accountHolder);
        System.out.printf("Balance: ₹%.2f\n", balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.printf("Successfully deposited: ₹%.2f\n", amount);
        System.out.printf("Updated Balance: ₹%.2f\n", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Transaction failed: Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.printf("Successfully withdrawn: ₹%.2f\n", amount);
        System.out.printf("Updated Balance: ₹%.2f\n", balance);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account userAccount = new Account("Sai", 5000.00, 1234);

        System.out.println("=== Welcome to the ATM ===");
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();

        if (!userAccount.verifyPin(enteredPin)) {
            System.out.println("Invalid PIN. Access denied.");
            scanner.close();
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userAccount.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depAmount = scanner.nextDouble();
                    userAccount.deposit(depAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withAmount = scanner.nextDouble();
                    userAccount.withdraw(withAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please choose an option between 1 and 4.");
            }
        }

        scanner.close();
    }
}