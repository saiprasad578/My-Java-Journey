import java.util.*;

class Solution36 {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int idx = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) == 2) {
                res[idx++] = num;
            }
        }

        return res;
    }
}