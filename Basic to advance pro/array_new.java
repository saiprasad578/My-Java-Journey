import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Step 1: Put nums1 numbers into a set (no duplicates allowed)
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Step 2: Set for storing common numbers
        Set<Integer> resultSet = new HashSet<>();

        // Step 3: Check nums2 numbers
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // only unique numbers get added
            }
        }

        // Step 4: Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
