class minimum5 {
    public int minOperations(int[] nums, int k) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) s += nums[i];
        int r = s % k;
        if (r == 0) return 0;
        return r;
    }
}
