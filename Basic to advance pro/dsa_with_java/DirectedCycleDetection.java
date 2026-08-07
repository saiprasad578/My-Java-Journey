import java.util.*;

public class DirectedCycleDetection {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    DirectedCycleDetection(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] recStack) {

        visited[vertex] = true;
        recStack[vertex] = true;

        for (int neighbor : adjList[vertex]) {

            if (!visited[neighbor]) {
                if (isCyclicUtil(neighbor, visited, recStack))
                    return true;
            } else if (recStack[neighbor]) {
                return true;
            }
        }

        recStack[vertex] = false;
        return false;
    }

    boolean isCyclic() {

        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, recStack))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DirectedCycleDetection graph = new DirectedCycleDetection(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1); // Creates a cycle

        if (graph.isCyclic())
            System.out.println("Cycle detected in the directed graph.");
        else
            System.out.println("No cycle found.");
    }
}