import java.util.*;

class xsum2 {
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();
        TreeMap<Pair, Integer> top = new TreeMap<>(), rest = new TreeMap<>();
        long sum = 0;

        for (int i = 0; i < k; i++) add(nums[i], freq, top, rest, x);
        sum = calc(top);
        ans[0] = sum;

        for (int i = k; i < n; i++) {
            remove(nums[i - k], freq, top, rest, x);
            add(nums[i], freq, top, rest, x);
            ans[i - k + 1] = calc(top);
        }
        return ans;
    }

    static class Pair implements Comparable<Pair> {
        int val, f;
        Pair(int v, int f) { this.val = v; this.f = f; }
        public int compareTo(Pair o) {
            if (f != o.f) return o.f - f;
            return o.val - val;
        }
    }

    void add(int num, Map<Integer, Integer> freq, TreeMap<Pair, Integer> top, TreeMap<Pair, Integer> rest, int x) {
        int old = freq.getOrDefault(num, 0);
        if (old > 0) {
            Pair p = new Pair(num, old);
            if (top.containsKey(p)) {
                top.remove(p);
            } else {
                rest.remove(p);
            }
        }   