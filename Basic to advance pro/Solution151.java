import java.util.Arrays;

public class Solution151 {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers closer together
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Original: " + Arrays.toString(numbers));

        reverse(numbers);
        System.out.println("Reversed: " + Arrays.toString(numbers));
    }
}