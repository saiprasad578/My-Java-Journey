class greatest {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for (int n : nums) {
            int[] cur = dp.clone();
            for (int x : cur) dp[(x + n) % 3] = Math.max(dp[(x + n) % 3], x + n);
        }
        return dp[0];
    }
}
