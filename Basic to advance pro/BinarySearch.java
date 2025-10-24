
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 8;
        int left = 0, right = arr.length - 1;
        boolean found = false;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        if (!found) System.out.println("Not Found");
    }
}
