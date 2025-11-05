import java.util.*;

class hash {
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < k; i++) freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        ans[0] = calc(freq, x);

        for (int i = k; i < n; i++) {
            int out = nums[i - k], in = nums[i];
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);
            freq.put(in, freq.getOrDefault(in, 0) + 1);
            ans[i - k + 1] = calc(freq, x);
        }
        return ans;
    }

    private long calc(Map<Integer, Integer> freq, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) return b[0] - a[0];
            return b[1] - a[1];
        });
        for (var e : freq.entrySet()) pq.offer(new int[]{e.getKey(), e.getValue()});
        long sum = 0;
        int cnt = 0;
        while (!pq.isEmpty() && cnt < x) {
            int[] cur = pq.poll();
            sum += (long) cur[0] * cur[1];
            cnt++;
        }
        return sum;
    }
}
