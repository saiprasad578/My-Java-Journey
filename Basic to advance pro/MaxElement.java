public class MaxElement {

    static int findMax(int arr[], int l, int r) {
        if (l == r)
            return arr[l];

        int mid = (l + r) / 2;

        int leftMax = findMax(arr, l, mid);
        int rightMax = findMax(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 2, 7, 5};

        int max = findMax(arr, 0, arr.length - 1);

        System.out.println("Maximum element: " + max);
    }
}