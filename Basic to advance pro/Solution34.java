class Solution34 {
    private double balance;
    private String accountHolder;

    // Setter for account holder
    void setAccountHolder(String name) {
        accountHolder = name;
    }

    // Getter for account holder
    String getAccountHolder() {
        return accountHolder;
    }

    // Setter for balance
    void setBalance(double b) {
        balance = b;
    }

    // Getter for balance
    double getBalance() {
        return balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Solution34 a = new Solution34();

        a.setAccountHolder("Sai Prasad");
        a.setBalance(5000);

        a.displayDetails();

        a.deposit(2000);
        a.withdraw(1500);

        System.out.println("Final Balance: " + a.getBalance());
    }
}