import java.util.*;
class graph4 {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(g, i, vis);
                count++;
            }
        }
        return count;
    }
    private void dfs(List<List<Integer>> g, int u, boolean[] vis) {
        vis[u] = true;
        for (int v : g.get(u)) if (!vis[v]) dfs(g, v, vis);
    }
}
