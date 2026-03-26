class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;

        //  strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        // need at least one increase
        if (i == 0) return false;

        // strictly decreasing
        int p = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        // need at least one decrease
        if (i == p) return false;

        // strictly increasing
        int q = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        // need at least one increase and must reach end
        if (i == q) return false;

        return i == n - 1;
    }
}
