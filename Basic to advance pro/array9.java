import java.util.Arrays;

class array9 {

    boolean simulate(int[] nums, int curr, int dir) {
        int n = nums.length;
        int[] a = Arrays.copyOf(nums, n);

        while (curr >= 0 && curr < n) {
            if (a[curr] == 0) {
                curr += dir;
            } else {
                a[curr]--;
                dir = -dir;
                curr += dir;
            }
        }

        for (int x : a)
            if (x != 0)
                return false;

        return true;
    }

    public int countValidSelections(int[] nums) {
        int n = nums.length, ans = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (simulate(nums, i, 1)) ans++;
                if (simulate(nums, i, -1)) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        array9 obj = new array9();
        int[] nums = {0, 1, 0, 1};
        System.out.println(obj.countValidSelections(nums));
    }
}
