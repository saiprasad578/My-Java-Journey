public class Solution81 {

    static int search(int arr[], int n, int key) {
        if (n == 0)
            return -1;

        if (arr[n - 1] == key)
            return n - 1;

        return search(arr, n - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 5};
        int key = 9;

        int result = search(arr, arr.length, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}