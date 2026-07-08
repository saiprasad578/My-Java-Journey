import java.util.*;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 8;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}