import java.util.*;

public class CycleDetection {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    CycleDetection(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); // Undirected graph
    }

    boolean isCyclicUtil(int vertex, boolean[] visited, int parent) {
        visited[vertex] = true;

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                if (isCyclicUtil(neighbor, visited, vertex))
                    return true;
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    boolean isCyclic() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, -1))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        CycleDetection graph = new CycleDetection(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0); // Creates a cycle
        graph.addEdge(3, 4);

        if (graph.isCyclic())
            System.out.println("Graph contains a cycle.");
        else
            System.out.println("Graph does not contain a cycle.");
    }
}