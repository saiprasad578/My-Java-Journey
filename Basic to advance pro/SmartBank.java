class SmartBank {
    long[] balance;
    public SmartBank(long[] balance) {
        this.balance = balance;
    }
    private boolean valid(int account) {
        return account >= 1 && account <= balance.length;
    }
    public boolean transfer(int from, int to, long amount) {
        if (!valid(from) || !valid(to) || balance[from - 1] < amount) return false;
        balance[from - 1] -= amount;
        balance[to - 1] += amount;
        return true;
    }
    public boolean deposit(int account, long amount) {
        if (!valid(account)) return false;
        balance[account - 1] += amount;
        return true;
    }
    public boolean withdraw(int account, long amount) {
        if (!valid(account) || balance[account - 1] < amount) return false;
        balance[account - 1] -= amount;
        return true;
    }
}
