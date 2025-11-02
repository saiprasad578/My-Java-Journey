class program11 {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        boolean[][] seen = new boolean[m][n];
        for (int[] g : guards) {
            for (int i = g[0] - 1; i >= 0 && grid[i][g[1]] == 0; i--) seen[i][g[1]] = true;
            for (int i = g[0] + 1; i < m && grid[i][g[1]] == 0; i++) seen[i][g[1]] = true;
            for (int j = g[1] - 1; j >= 0 && grid[g[0]][j] == 0; j--) seen[g[0]][j] = true;
            for (int j = g[1] + 1; j < n && grid[g[0]][j] == 0; j++) seen[g[0]][j] = true;
        }
        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0 && !seen[i][j]) count++;
        return count;
    }
}
