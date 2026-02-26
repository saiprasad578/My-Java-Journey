import java.util.*;

public class XSumProblem1 {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            List<int[]> list = new ArrayList<>();
            for (var e : freq.entrySet()) list.add(new int[]{e.getKey(), e.getValue()});
            list.sort((a, b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);
            Set<Integer> keep = new HashSet<>();
            for (int t = 0; t < Math.min(x, list.size()); t++) keep.add(list.get(t)[0]);
            int sum = 0;
            for (int j = i; j < i + k; j++) if (keep.contains(nums[j])) sum += nums[j];
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        XSumProblem1 s = new XSumProblem1();
        int[] nums = {1,1,2,2,3,4,2,3};
        int k = 6, x = 2;
       
        // Expected: [6, 10, 12]
    }
}
