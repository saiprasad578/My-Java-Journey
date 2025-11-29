class minimum4 {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int x : nums) sum += x;
        return sum % k;
    }
}
