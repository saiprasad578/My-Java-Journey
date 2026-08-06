import java.util.*;

public class ConnectedComponents {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    ConnectedComponents(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); // Undirected Graph
    }

    void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    int countComponents() {
        boolean[] visited = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        ConnectedComponents graph = new ConnectedComponents(6);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);

        graph.addEdge(3, 4);

        // Vertex 5 is isolated

        System.out.println("Number of Connected Components: " +
                graph.countComponents());
    }
}