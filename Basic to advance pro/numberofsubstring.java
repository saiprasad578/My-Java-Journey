class numberofsubstring {
    public int numSub(String s) {
        long mod = 1000000007;
        long count = 0, run = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                run++;
                count = (count + run) % mod;
            } else {
                run = 0;
            }
        }
        return (int) count;
    }
}
