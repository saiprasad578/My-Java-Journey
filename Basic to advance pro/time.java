import java.util.*;
class time {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        boolean[][] seen = new boolean[m][n];
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] g : guards) {
            for (int[] d : dirs) {
                int r = g[0] + d[0], c = g[1] + d[1];
                while (r >= 0 && c >= 0 && r < m && c < n && grid[r][c] == 0) {
                    seen[r][c] = true;
                    r += d[0];
                    c += d[1];
                }
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0 && !seen[i][j]) res++;
        return res;
    }
}
