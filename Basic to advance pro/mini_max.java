class mini_max {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        int[] res = new int[1];
        
        dfs(0, -1, g, values, k, res);
        return res[0];
    }

    private long dfs(int u, int p, List<Integer>[] g, int[] values, int k, int[] res) {
        long sum = values[u];
        for (int v : g[u]) {
            if (v == p) continue;
            long s = dfs(v, u, g, values, k, res);
            sum += s;
        }
        if (sum % k == 0) res[0]++;
        return sum % k;
    }
}
