import java.util.*;

public class XSumProblem3 {

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            List<int[]> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                list.add(new int[]{e.getKey(), e.getValue()});
            }

            list.sort((a, b) -> {
                if (a[1] != b[1]) return Integer.compare(b[1], a[1]);
                return Integer.compare(b[0], a[0]);
            });

            Set<Integer> keep = new HashSet<>();
            for (int t = 0; t < Math.min(x, list.size()); t++) {
                keep.add(list.get(t)[0]);
            }

            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (keep.contains(nums[j])) sum += nums[j];
            }

            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        XSumProblem3 s = new XSumProblem3();
        int[] nums = {9, 8, 7, 9, 6, 9, 8, 8, 7};
        int k = 4, x = 3;
        System.out.println(Arrays.toString(s.findXSum(nums, k, x)));
        // [33, 24, 31, 32, 31, 32]
    }
}
