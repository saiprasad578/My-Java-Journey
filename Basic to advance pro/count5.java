import java.util.*;

class count5 {

    // Returns true if segments (A,B) and (C,D) are parallel
    private boolean parallel(int[] A, int[] B, int[] C, int[] D) {
        long x1 = B[0] - A[0];
        long y1 = B[1] - A[1];
        long x2 = D[0] - C[0];
        long y2 = D[1] - C[1];
        return x1 * y2 == x2 * y1;
    }

    // Returns the midpoint hash for segment (A,B)
    private long midHash(int[] A, int[] B) {
        long mx = A[0] + B[0];
        long my = A[1] + B[1];
        return (mx << 32) ^ (my & 0xffffffffL);
    }

    public int countTrapezoids(int[][] points) {
        int n = points.length;
        List<int[]> segA = new ArrayList<>();
        List<int[]> segB = new ArrayList<>();

        // store segments as (i,j)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                segA.add(new int[]{i, j});
            }
        }

        int m = segA.size();
        int count = 0;

        // For each pair of segments check:
        // 1. They are parallel
        // 2. Midpoints are different (not overlapping)
        for (int s1 = 0; s1 < m; s1++) {
            int a1 = segA.get(s1)[0];
            int b1 = segA.get(s1)[1];

            for (int s2 = s1 + 1; s2 < m; s2++) {

                int a2 = segA.get(s2)[0];
                int b2 = segA.get(s2)[1];

                // ensure 4 distinct points
                if (a1 == a2 || a1 == b2 || b1 == a2 || b1 == b2)
                    continue;

                // Check parallel
                if (!parallel(points[a1], points[b1], points[a2], points[b2]))
                    continue;

                // Check midpoints are not equal
                long m1 = midHash(points[a1], points[b1]);
                long m2 = midHash(points[a2], points[b2]);
                if (m1 == m2)
                    continue;

                // valid trapezoid
                count++;
            }
        }

        return count;
    }
}
