class unique {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] left = new int[26];
        int[] right = new int[26];
        for (int i = 0; i < n; i++) right[s.charAt(i) - 'a']++;
        boolean[][] seen = new boolean[26][26];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int mid = s.charAt(i) - 'a';
            right[mid]--;
            for (int c = 0; c < 26; c++) {
                if (left[c] > 0 && right[c] > 0 && !seen[c][mid]) {
                    seen[c][mid] = true;
                    res++;
                }
            }
            left[mid]++;
        }
        return res;
    }
}
