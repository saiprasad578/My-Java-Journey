class countnumber {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        int limit = (int)Math.sqrt(n) + 1;
        for (int i = 0; i < n; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') zeros++;
                else ones++;
                if (zeros > limit) break;
                if (ones >= zeros * zeros) ans++;
            }
        }
        return ans;
    }
}
