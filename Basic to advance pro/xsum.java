import java.util.*;

class xsum {
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();
        TreeMap<Integer, TreeSet<Integer>> groups = new TreeMap<>();
        long topSum = 0;
        Map<Integer, Long> valueSum = new HashMap<>();

        for (int i = 0; i < k; i++) {
            add(nums[i], freq, groups, valueSum);
        }
        topSum = getTopSum(groups, freq, x);
        ans[0] = topSum;

        for (int i = k; i < n; i++) {
            remove(nums[i - k], freq, groups, valueSum);
            add(nums[i], freq, groups, valueSum);
            topSum = getTopSum(groups, freq, x);
            ans[i - k + 1] = topSum;
        }
        return ans;
    }

    private void add(int num, Map<Integer, Integer> freq, TreeMap<Integer, TreeSet<Integer>> groups, Map<Integer, Long> valueSum) {
        if (freq.containsKey(num)) {
            int f = freq.get(num);
            groups.get(f).remove(num);
            if (groups.get(f).isEmpty()) groups.remove(f);
            valueSum.put(num, valueSum.get(num) - (long) num * f);
        }
        freq.put(num, freq.getOrDefault(num, 0) + 1);
        int newF = freq.get(num);
        groups.computeIfAbsent(newF, z -> new TreeSet<>((a, b) -> b - a)).add(num);
        valueSum.put(num, (long) num * newF);
    }

    private void remove(int num, Map<Integer, Integer> freq, TreeMap<Integer, TreeSet<Integer>> groups, Map<Integer, Long> valueSum) {
        int f = freq.get(num);
        groups.get(f).remove(num);
        if (groups.get(f).isEmpty()) groups.remove(f);
        valueSum.put(num, valueSum.get(num) - (long) num * f);
        if (f == 1) {
            freq.remove(num);
            valueSum.remove(num);
        } else {
            freq.put(num, f - 1);
            groups.computeIfAbsent(f - 1, z -> new TreeSet<>((a, b) -> b - a)).add(num);
            valueSum.put(num, (long) num * (f - 1));
        }
    }

    private long getTopSum(TreeMap<Integer, TreeSet<Integer>> groups, Map<Integer, Integer> freq, int x) {
        long sum = 0;
        int count = 0;
        for (int f : groups.descendingKeySet()) {
            for (int num : groups.get(f)) {
                int occ = freq.get(num);
                sum += (long) occ * num;
                count++;
                if (count == x) return sum;
            }
        }
        return sum;
    }
}
