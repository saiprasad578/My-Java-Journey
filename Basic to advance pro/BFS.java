import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class BFS {
    private final List<List<Integer>> adj;

    // Constructor
    public BFS(int vertices) {
        this.adj = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            this.adj.add(new ArrayList<>());
        }
    }

    // Add a directed edge from source (v) to destination (w)
    public void addEdge(int v, int w) {
        if (v >= 0 && v < adj.size()) {
            adj.get(v).add(w);
        } else {
            throw new IllegalArgumentException("Vertex " + v + " out of bounds.");
        }
    }

    // Breadth-First Search Traversal
    public void bfs(int startVertex) {
        if (startVertex < 0 || startVertex >= adj.size()) {
            System.out.println("Starting vertex out of bounds.");
            return;
        }

        boolean[] visited = new boolean[adj.size()];
        // Using ArrayDeque as it is generally faster and more efficient than LinkedList for a Queue
        Queue<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            // Visit all unvisited neighbors of the dequeued vertex
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println(); // Prints a clean newline at the end of traversal
    }

    public static void main(String[] args) {
        BFS graph = new BFS(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("BFS Traversal:");
        graph.bfs(0);
    }
}