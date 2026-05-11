import java.util.*;

public class Solution109 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}