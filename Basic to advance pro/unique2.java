class unique2 {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] pos = new int[26][2];
        for (int i = 0; i < 26; i++) {
            pos[i][0] = n;
            pos[i][1] = -1;
        }
        for (int i = 0; i < n; i++) {
            int k = s.charAt(i) - 'a';
            pos[k][0] = Math.min(pos[k][0], i);
            pos[k][1] = Math.max(pos[k][1], i);
        }

        int ans = 0;
        for (int c = 0; c < 26; c++) {
            int l = pos[c][0], r = pos[c][1];
            if (l < r) {
                boolean[] mid = new boolean[26];
                for (int i = l + 1; i < r; i++) {
                    mid[s.charAt(i) - 'a'] = true;
                }
                for (int k = 0; k < 26; k++) {
                    if (mid[k]) ans++;
                }
            }
        }
        return ans;
    }
}
