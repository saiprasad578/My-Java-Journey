public class TwoPointerSum {
    public static boolean hasTargetSum(int[] arr, int target) {
        // Initialize pointers at scratch boundaries
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                return true; 
            } else if (currentSum < target) {
                left++; // Sum is too small, move left pointer right to increase it
            } else {
                right--; // Sum is too large, move right pointer left to decrease it
            }
        }

        System.out.println("No pair found that adds up to " + target);
        return false;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 6, 8, 11, 13};
        int target = 10;

        hasTargetSum(sortedArray, target);
    }
}