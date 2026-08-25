public class MaxSubarraySum {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i];
            windowSum -= arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}