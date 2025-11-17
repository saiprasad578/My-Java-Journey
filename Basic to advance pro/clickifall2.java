class clickifall2 {
    public boolean kLengthApart(int[] nums, int k) {
        int dist = k;
        for (int n : nums) {
            if (n == 1) {
                if (dist < k) return false;
                dist = 0;
            } else {
                dist++;
            }
        }
        return true;
    }
}
