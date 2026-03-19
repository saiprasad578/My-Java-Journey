class Solution40 {
    public int minNumberOperations(int[] target) {
        // The first element always requires target[0] operations 
        // to be raised from zero.
        int operations = target[0];
        
        for (int i = 1; i < target.length; i++) {
            // If the current element is higher than the previous one,
            // we need additional operations to bridge that gap.
            if (target[i] > target[i - 1]) {
                operations += (target[i] - target[i - 1]);
            }
            // If target[i] <= target[i-1], no new operations are 
            // needed because the operations used for target[i-1] 
            // already cover the height needed for target[i].
        }
        
        return operations;
    }
}