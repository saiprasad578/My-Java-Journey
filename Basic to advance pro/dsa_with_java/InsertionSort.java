import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Before Sorting: "
                + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After Sorting: "
                + Arrays.toString(arr));
    }
}