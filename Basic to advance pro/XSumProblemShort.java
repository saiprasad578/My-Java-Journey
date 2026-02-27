import java.util.*;

public class XSumProblemShort {

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        if (k > n) return new int[0];

        int[] res = new int[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        // first window
        for (int i = 0; i < k; i++)
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

        for (int i = 0; i <= n - k; i++) {

            // sort by freq desc, value desc
            List<int[]> list = new ArrayList<>();
            for (var e : freq.entrySet())
                list.add(new int[]{e.getKey(), e.getValue()});

            list.sort((a, b) ->
                a[1] != b[1] ? b[1] - a[1] : b[0] - a[0]
            );

            Set<Integer> keep = new HashSet<>();
            for (int t = 0; t < Math.min(x, list.size()); t++)
                keep.add(list.get(t)[0]);

            int sum = 0;
            for (int j = i; j < i + k; j++)
                if (keep.contains(nums[j])) sum += nums[j];

            res[i] = sum;

            // slide window
            if (i + k < n) {
                freq.put(nums[i], freq.get(nums[i]) - 1);
                if (freq.get(nums[i]) == 0) freq.remove(nums[i]);

                freq.put(nums[i + k], freq.getOrDefault(nums[i + k], 0) + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        XSumProblemShort s = new XSumProblemShort();
        int[] nums = {5, 5, 1, 2, 2, 2, 3, 4};
        int k = 5, x = 2;
       
    }
}
