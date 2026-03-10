class Solution8 {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPref = new long[k];
        for (int i = 0; i < k; i++) minPref[i] = Long.MAX_VALUE;
        long prefix = 0;
        minPref[0] = 0;
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int r = (i + 1) % k;
            if (minPref[r] != Long.MAX_VALUE) ans = Math.max(ans, prefix - minPref[r]);
            if (prefix < minPref[r]) minPref[r] = prefix;
        }
        return ans;
    }
}
