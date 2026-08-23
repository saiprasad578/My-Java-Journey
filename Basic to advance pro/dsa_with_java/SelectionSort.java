import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: "
                + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sorting: "
                + Arrays.toString(arr));
    }
}