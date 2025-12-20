import java.util.*;

class GraphCheck {
    static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; // number of nodes
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // adding edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(0).add(3);
        graph.get(3).add(0);

        graph.get(2).add(4);
        graph.get(4).add(2);

        boolean[] visited = new boolean[n];

        int start = 0;
        int end = 4;

        dfs(start, visited, graph);

        if (visited[end]) {
            System.out.println("Connected");
        } else {
            System.out.println("Not Connected");
        }
    }
}
