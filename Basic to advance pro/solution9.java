class solution26 {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n + 1][n + 1];
        for (int[] q : queries) {
            int r1 = q[0], c1 = q[1], r2 = q[2], c2 = q[3], v = q[4];
            diff[r1][c1] += v;
            diff[r1][c2 + 1] -= v;
            diff[r2 + 1][c1] -= v;
            diff[r2 + 1][c2 + 1] += v;
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                diff[i][j + 1] += diff[i][j];
        for (int j = 0; j < n; j++)
            for (int i = 0; i < n; i++)
                diff[i + 1][j] += diff[i][j];
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++)
             for (int j = 0; j < n; j++)
                res[i][j] = diff[i][j];
        return res;
    }
}
