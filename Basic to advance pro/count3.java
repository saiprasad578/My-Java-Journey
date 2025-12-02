import java.util.*;

class count3 {
    public int countTrapezoids(int[][] points) {
        int mod = 1_000_000_007;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] p : points) map.put(p[1], map.getOrDefault(p[1], 0) + 1);
        long res = 0;
        List<Integer> ys = new ArrayList<>(map.keySet());
        int m = ys.size();
        long[] comb = new long[m];
        for (int i = 0; i < m; i++) {
            long c = map.get(ys.get(i));
            comb[i] = c < 2 ? 0 : (c * (c - 1) / 2) % mod;
        }
        for (int i = 0; i < m; i++)
            if (comb[i] != 0)
                for (int j = i + 1; j < m; j++)
                    if (comb[j] != 0)
                        res = (res + comb[i] * comb[j]) % mod;
        return (int) res;
    }
}
