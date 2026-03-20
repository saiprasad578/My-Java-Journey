import java.util.*;

class Solution42 {
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        // Comparator MUST use the map. 
        // Note: TreeSet considers (cmp == 0) as "the same element".
        Comparator<Integer> cmp = (a, b) -> {
            int fa = freq.getOrDefault(a, 0), fb = freq.getOrDefault(b, 0);
            if (fa != fb) return Integer.compare(fa, fb);
            return Integer.compare(a, b);
        };

        TreeSet<Integer> topX = new TreeSet<>(cmp);
        TreeSet<Integer> rest = new TreeSet<>(cmp);
        long[] sumTop = {0L}; // Use array to pass by reference for convenience

        for (int i = 0; i < n; i++) {
            // 1. ADD incoming element nums[i]
            int v = nums[i];
            removeFromSets(v, topX, rest, freq, sumTop);
            freq.put(v, freq.getOrDefault(v, 0) + 1);
            rest.add(v);

            // 2. REMOVE outgoing element nums[i-k]
            if (i >= k) {
                int u = nums[i - k];
                removeFromSets(u, topX, rest, freq, sumTop);
                int count = freq.get(u);
                if (count == 1) {
                    freq.remove(u);
                } else {
                    freq.put(u, count - 1);
                    rest.add(u);
                }
            }

            // 3. REBALANCE
            rebalance(topX, rest, freq, x, sumTop);

            // 4. RECORD result
            if (i >= k - 1) {
                ans[i - k + 1] = sumTop[0];
            }
        }
        return ans;
    }

    private void removeFromSets(int val, TreeSet<Integer> topX, TreeSet<Integer> rest, Map<Integer, Integer> freq, long[] sumTop) {
        if (topX.remove(val)) {
            sumTop[0] -= (long) freq.get(val) * val;
        } else {
            rest.remove(val);
        }
    }

    private void rebalance(TreeSet<Integer> topX, TreeSet<Integer> rest, Map<Integer, Integer> freq, int x, long[] sumTop) {
        // Move from rest to topX if topX has room
        while (!rest.isEmpty() && topX.size() < x) {
            int best = rest.pollLast();
            topX.add(best);
            sumTop[0] += (long) freq.get(best) * best;
        }

        // Move from topX to rest if topX is too full
        while (topX.size() > x) {
            int worst = topX.pollFirst();
            rest.add(worst);
            sumTop[0] -= (long) freq.get(worst) * worst;
        }

        // Swap if the best in rest is better than the worst in topX
        while (!topX.isEmpty() && !rest.isEmpty()) {
            int worstTop = topX.first();
            int bestRest = rest.last();
            
            int fw = freq.get(worstTop), fr = freq.get(bestRest);
            if (fr > fw || (fr == fw && bestRest > worstTop)) {
                topX.pollFirst();
                rest.pollLast();
                topX.add(bestRest);
                rest.add(worstTop);
                sumTop[0] += (long) fr * bestRest - (long) fw * worstTop;
            } else {
                break;
            }
        }
    }
}