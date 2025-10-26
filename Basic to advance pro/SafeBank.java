class SafeBank {
    long[] accounts;
    public SafeBank(long[] balance) {
        this.accounts = balance;
    }
    private boolean inRange(int acc) {
        return acc > 0 && acc <= accounts.length;
    }
    public boolean deposit(int acc, long amt) {
        if (!inRange(acc)) return false;
        accounts[acc - 1] += amt;
        return true;
    }
    public boolean withdraw(int acc, long amt) {
        if (!inRange(acc) || accounts[acc - 1] < amt) return false;
        accounts[acc - 1] -= amt;
        return true;
    }
    public boolean transfer(int from, int to, long amt) {
        if (!inRange(from) || !inRange(to) || accounts[from - 1] < amt) return false;
        accounts[from - 1] -= amt;
        accounts[to - 1] += amt;
        return true;
    }
}
