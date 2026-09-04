import java.util.*;

public class directed {

    static boolean dfs(int node,
                       ArrayList<ArrayList<Integer>> graph,
                       boolean[] visited,
                       boolean[] recursionStack) {

        visited[node] = true;
        recursionStack[node] = true;

        for (int neighbor : graph.get(node)) {

            // If neighbor is not visited
            if (!visited[neighbor]) {

                if (dfs(neighbor, graph, visited, recursionStack)) {
                    return true;
                }

            }
            // If neighbor is already in current DFS path
            else if (recursionStack[neighbor]) {
                return true;
            }
        }

        // Remove node from current DFS path
        recursionStack[node] = false;

        return false;
    }

    static boolean hasCycle(int vertices,
                            ArrayList<ArrayList<Integer>> graph) {

        boolean[] visited = new boolean[vertices];
        boolean[] recursionStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (dfs(i, graph, visited, recursionStack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Directed edges
        // 0 -> 1 -> 2 -> 3 -> 1

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(1);

        if (hasCycle(vertices, graph)) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle found.");
        }
    }
}