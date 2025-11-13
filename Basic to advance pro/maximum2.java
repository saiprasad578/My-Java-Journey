class maximum2 {
    public int maxOperations(String s) {
        int res = 0, ones = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == '1' && s.charAt(i) == '0')
                res += ++ones;
            else if (s.charAt(i) == '1')
                ones++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxOperations("1001101")); // 4
        System.out.println(sol.maxOperations("00111"));   // 0
        System.out.println(sol.maxOperations("1010"));    // 3
        System.out.println(sol.maxOperations("110011"));  // 2
    }
}
