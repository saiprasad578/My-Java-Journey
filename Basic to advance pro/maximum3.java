class maximum3 {
    public int maxOperations(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i + 1) == '0')
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        maximum3 sol = new maximum3();
        System.out.println(sol.maxOperations("1001101")); // 2
        System.out.println(sol.maxOperations("00111"));   // 0
        System.out.println(sol.maxOperations("1010"));    // 2
        System.out.println(sol.maxOperations("110011"));  // 1
    }
}
