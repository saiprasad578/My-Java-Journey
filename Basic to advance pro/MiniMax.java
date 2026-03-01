import java.util.*;

class MiniMax {

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        
        // Create adjacency list
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }

        // Build graph
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        int[] res = new int[1];

        dfs(0, -1, g, values, k, res);
        return res[0];
    }

    private long dfs(int u, int parent, List<Integer>[] g, int[] values, int k, int[] res) {

        long sum = values[u];

        for (int v : g[u]) {
            if (v == parent) continue;

            long childSum = dfs(v, u, g, values, k, res);
            sum += childSum;
        }

        if (sum % k == 0) {
            res[0]++;
            return 0;   // Important optimization
        }

        return sum % k;
    }
}