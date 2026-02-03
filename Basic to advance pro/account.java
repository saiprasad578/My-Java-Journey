class account {
    private double balance;

    void setBalance(double b) {
        balance = b;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        account a = new account();
        a.setBalance(5000);
        System.out.println(a.getBalance());
    }
}
