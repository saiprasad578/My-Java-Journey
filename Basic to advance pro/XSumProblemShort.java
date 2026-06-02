import java.util.*;

public class XSumProblemShort {

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;

        if (k > n) {
            return new int[0];
        }

        int[] result = new int[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        // Build first window frequency map
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for (int start = 0; start <= n - k; start++) {

            // Store (value, frequency)
            List<int[]> list = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                list.add(new int[]{entry.getKey(), entry.getValue()});
            }

            // Sort by frequency descending, then value descending
            list.sort((a, b) ->
                a[1] != b[1] ? b[1] - a[1] : b[0] - a[0]
            );

            // Keep top x elements
            Set<Integer> topElements = new HashSet<>();

            for (int i = 0; i < Math.min(x, list.size()); i++) {
                topElements.add(list.get(i)[0]);
            }

            // Calculate x-sum
            int sum = 0;

            for (int i = start; i < start + k; i++) {
                if (topElements.contains(nums[i])) {
                    sum += nums[i];
                }
            }

            result[start] = sum;

            // Slide window
            if (start + k < n) {
                int remove = nums[start];
                freq.put(remove, freq.get(remove) - 1);

                if (freq.get(remove) == 0) {
                    freq.remove(remove);
                }

                int add = nums[start + k];
                freq.put(add, freq.getOrDefault(add, 0) + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        XSumProblemShort solution = new XSumProblemShort();

        int[] nums = {5, 5, 1, 2, 2, 2, 3, 4};
        int k = 5;
        int x = 2;

        int[] result = solution.findXSum(nums, k, x);

        System.out.println("X-Sum Results:");
        System.out.println(Arrays.toString(result));
    }
}