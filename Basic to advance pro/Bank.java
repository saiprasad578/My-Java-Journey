class Bank {
    long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;
    }
    private boolean valid(int account) {
        return account >= 1 && account <= balance.length;
    }
    public boolean transfer(int account1, int account2, long money) {
        if (!valid(account1) || !valid(account2) || balance[account1 - 1] < money) return false;
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }
    public boolean deposit(int account, long money) {
        if (!valid(account)) return false;
        balance[account - 1] += money;
        return true;
    }
    public boolean withdraw(int account, long money) {
        if (!valid(account) || balance[account - 1] < money) return false;
        balance[account - 1] -= money;
        return true;
    }
}
