class array10 {
    public int balancedSplits(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int x : nums) total += x;
        int left = 0, ans = 0;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            if (left == total - left) ans++;
        }
        return ans;
    }
}
