import java.util.ArrayList;
import java.util.List;

public class Main2 {

    // Use List interface for better flexibility and abstraction
    private final List<List<Integer>> adj;

    // Constructor
    public Main2(int vertices) {
        this.adj = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            this.adj.add(new ArrayList<>());
        }
    }

    // Add directed edge from source (v) to destination (w)
    public void addEdge(int v, int w) {
        if (v >= 0 && v < adj.size()) {
            adj.get(v).add(w);
        } else {
            throw new IllegalArgumentException("Vertex " + v + " out of bounds.");
        }
    }

    // DFS Utility Function (Recursive)
    private void dfsUtil(int v, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Main DFS Function
    public void dfs(int startVertex) {
        if (startVertex < 0 || startVertex >= adj.size()) {
            System.out.println("Starting vertex out of bounds.");
            return;
        }

        boolean[] visited = new boolean[adj.size()];
        dfsUtil(startVertex, visited);
        System.out.println(); // Prints a clean newline at the end of traversal
    }

    public static void main(String[] args) {
        Main2 graph = new Main2(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS Traversal:");
        graph.dfs(0);
    }
}