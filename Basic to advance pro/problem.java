import java.util.*;

class problem {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int[] res = new int[2];
        int idx = 0;
        for (int x : nums) {
            if (seen.contains(x)) res[idx++] = x;
            else seen.add(x);
        }
        return res;
    }
}
