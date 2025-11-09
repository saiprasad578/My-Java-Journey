import java.util.*;

class graph {
    public int minOperations(int[] nums) {
        int n = nums.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) if (nums[i] != 0 && nums[i + 1] != 0) {
            graph.get(i).add(i + 1);
            graph.get(i + 1).add(i);
        }
        boolean[] visited = new boolean[n];
        int ops = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && nums[i] != 0) {
                ops += dfs(nums, graph, visited, i);
            }
        }
        return ops;
    }

    private int dfs(int[] nums, List<List<Integer>> graph, boolean[] vis, int start) {
        List<Integer> comp = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start);
        vis[start] = true;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            comp.add(u);
            for (int v : graph.get(u)) {
                if (!vis[v]) {
                    vis[v] = true;
                    stack.push(v);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i : comp) min = Math.min(min, nums[i]);
        for (int i : comp) if (nums[i] != 0) nums[i] -= min;
        int res = min;
        for (int i : comp) if (nums[i] != 0) vis[i] = false;
        for (int i : comp) if (nums[i] != 0 && !vis[i]) res += dfs(nums, graph, vis, i);
        return Math.min(res, comp.size());
    }
}
