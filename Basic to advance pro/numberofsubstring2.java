class numberofsubstring2{
    public int numSub(String s) {
        long M = 1000000007;
        long res = 0;
        long seq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                seq++;
            } else {
                res = (res + seq * (seq + 1) / 2) % M;
                seq = 0;
            }
        }
        if (seq > 0) res = (res + seq * (seq + 1) / 2) % M;
        return (int) res;
    }
}
