class mini_max2 {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] vals, int k) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        int[] count = new int[1];
        compute(0, -1, adj, vals, k, count);
        return count[0];
    }

    private long compute(int node, int parent, List<Integer>[] adj, int[] vals, int k, int[] count) {
        long total = vals[node];
        for (int nxt : adj[node]) {
            if (nxt != parent) {
                total += compute(nxt, node, adj, vals, k, count);
            }
        }
        if (total % k == 0) count[0]++;
        return total % k;
    }
}
