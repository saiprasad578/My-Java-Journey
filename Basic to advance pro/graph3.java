import java.util.*;
class graph3 {
    public boolean hasCycle(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) 
            if (!vis[i] && dfs(g, i, -1, vis)) return true;
        return false;
    }
    private boolean dfs(List<List<Integer>> g, int u, int p, boolean[] vis) {
        vis[u] = true;
        for (int v : g.get(u)) {
            if (!vis[v]) {
                if (dfs(g, v, u, vis)) return true;
            } else if (v != p) return true;
        }
        return false;
    }
}
