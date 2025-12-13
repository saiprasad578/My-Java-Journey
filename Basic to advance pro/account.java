class account {
    private double balance;

    void setBalance(double b) {
        balance = b;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        System.out.println(a.getBalance());
    }
}
