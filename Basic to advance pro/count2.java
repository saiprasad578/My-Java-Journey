import java.util.*;

class count2 {
    public int countTrapezoids(int[][] points) {
        if (points == null || points.length == 0) return 0;

        int mod = 1_000_000_007;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));

        long res = 0;
        int n = points.length;
        long prevY = (long)points[0][1] - 1;
        long count = 0;
        List<Long> combs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long y = points[i][1];

            if (y != prevY) {
                if (count >= 2) combs.add(count*(count-1)/2);
                else combs.add(0L);

                count = 1;
                prevY = y;
            } else {
                count++;
            }
        }

        if (count >= 2) combs.add(count*(count-1)/2);
        else combs.add(0L);

        int m = combs.size();

        for (int i = 0; i < m; i++) {
            if (combs.get(i) == 0) continue;

            for (int j = i+1; j < m; j++) {
                if (combs.get(j) == 0) continue;

                res = (res + (combs.get(i) % mod) * (combs.get(j) % mod)) % mod;
            }
        }

        return (int)res;
    }
}