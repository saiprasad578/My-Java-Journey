import java.util.HashSet;

public class DistinctSubarraySum {
    public static long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currentSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currentSum += nums[right];

           
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
           
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println("Maximum distinct subarray sum: " + maximumSubarraySum(nums, k));
    }
}