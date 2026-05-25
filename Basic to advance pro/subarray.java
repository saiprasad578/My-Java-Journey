class subarray {

    // Function to find maximum subarray sum
    // where subarray length is divisible by k
    public long maxSubarraySum(int[] nums, int k) {

        int n = nums.length;

        // Stores minimum prefix sum for each remainder
        long[] minPrefix = new long[k];

        // Initialize with maximum value
        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;

        // Base case
        minPrefix[0] = 0;

        for (int i = 0; i < n; i++) {

            // Add current element to prefix sum
            prefixSum += nums[i];

            // Current remainder
            int remainder = (i + 1) % k;

            // Calculate possible maximum subarray sum
            if (minPrefix[remainder] != Long.MAX_VALUE) {
                maxSum = Math.max(maxSum,
                        prefixSum - minPrefix[remainder]);
            }

            // Update minimum prefix sum
            minPrefix[remainder] =
                    Math.min(minPrefix[remainder], prefixSum);
        }

        return maxSum;
    }

    // Main method
    public static void main(String[] args) {

        subarray obj = new subarray();

        int[] nums = {2, -1, 3, 4, -2, 1};
        int k = 3;

        long result = obj.maxSubarraySum(nums, k);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}