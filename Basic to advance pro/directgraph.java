import java.util.*;

public class directgraph {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) g.add(new ArrayList<>());
        for (int[] p : prerequisites) g.get(p[1]).add(p[0]);
        int[] vis = new int[numCourses];
        for (int i = 0; i < numCourses; i++)
            if (!dfs(g, vis, i)) return false;
        return true;
    }

    boolean dfs(List<List<Integer>> g, int[] vis, int u) {
        if (vis[u] == 1) return false;
        if (vis[u] == 2) return true;
        vis[u] = 1;
        for (int v : g.get(u)) if (!dfs(g, vis, v)) return false;
        vis[u] = 2;
        return true;
    }
}
