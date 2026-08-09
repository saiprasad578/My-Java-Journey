import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 30};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Original Array: "
                + Arrays.toString(arr));

        System.out.println("After Removing Duplicates: "
                + set);
    }
}