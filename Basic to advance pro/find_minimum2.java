class Solution {
    public int minimumOperations(int[] nums) {
        int total = 0;
        for (int v : nums) {
            int m = v % 3;
            if (m != 0) total += Math.min(m, 3 - m);
        }
        return total;
    }
}
