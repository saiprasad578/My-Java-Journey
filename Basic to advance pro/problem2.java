import java.util.*;

class problem2 {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) res[idx++] = nums[i];
        }
        return res;
    }
}
