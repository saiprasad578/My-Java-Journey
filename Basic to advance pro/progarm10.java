import java.util.*;

class program10{
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        Set<Long> guardSet = new HashSet<>(), wallSet = new HashSet<>(), seen = new HashSet<>();
        for (int[] g : guards) guardSet.add(1L * g[0] * n + g[1]);
        for (int[] w : walls) wallSet.add(1L * w[0] * n + w[1]);
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] g : guards) {
            for (int[] d : dirs) {
                int r = g[0] + d[0], c = g[1] + d[1];
                while (r >= 0 && c >= 0 && r < m && c < n) {
                    long key = 1L * r * n + c;
                    if (guardSet.contains(key) || wallSet.contains(key)) break;
                    seen.add(key);
                    r += d[0];
                    c += d[1];
                }
            }
        }
        int total = m * n - guardSet.size() - wallSet.size();
        return total - seen.size();
    }
}
