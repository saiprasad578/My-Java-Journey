class countnumber2 {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] pref0 = new int[n+1];
        int[] pref1 = new int[n+1];
        for (int i = 0; i < n; i++) {
            pref0[i+1] = pref0[i] + (s.charAt(i)=='0'?1:0);
            pref1[i+1] = pref1[i] + (s.charAt(i)=='1'?1:0);
        }

        int ans = 0;
        int lim = (int)Math.sqrt(n) + 2;

        for (int i = 0; i < n; i++) {
            for (int z = 0; z <= lim; z++) {
                int need = i;
                int lo = i, hi = n;
                while (lo < hi) {
                    int mid = (lo+hi)/2;
                    int zeros = pref0[mid] - pref0[i];
                    if (zeros >= z) hi = mid;
                    else lo = mid+1;
                }
                int pos = lo;
                if (pos > n) break;
                if (pos == n) {
                    int zeros = pref0[n] - pref0[i];
                    int ones = pref1[n] - pref1[i];
                    if (ones >= zeros*zeros) ans++;
                    break;
                }
                int zeros = pref0[pos] - pref0[i];
                int ones = pref1[pos] - pref1[i];
                if (ones >= zeros*zeros) ans++;
            }
        }

        return ans;
    }
}
