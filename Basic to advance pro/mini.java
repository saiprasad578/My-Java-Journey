class mini {
    public int minOperations(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private int dfs(int[] nums, int l, int r) {
        while (l <= r && nums[l] == 0) l++;
        while (r >= l && nums[r] == 0) r--;
        if (l > r) return 0;

        int min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) if (nums[i] != 0) min = Math.min(min, nums[i]);
        for (int i = l; i <= r; i++) if (nums[i] != 0) nums[i] -= min;

        int res = min;
        int i = l;
        while (i <= r) {
            if (nums[i] == 0) { i++; continue; }
            int j = i;
            while (j <= r && nums[j] != 0) j++;
            res += dfs(nums, i, j - 1);
            i = j;
        }

        return Math.min(res, r - l + 1);
    }
}
