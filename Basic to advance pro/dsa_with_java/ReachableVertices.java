import java.util.*;

public class ReachableVertices {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    ReachableVertices(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    void printReachableVertices(int start) {
        boolean[] visited = new boolean[vertices];

        System.out.print("Reachable vertices from " + start + ": ");
        dfs(start, visited);
    }

    public static void main(String[] args) {

        ReachableVertices graph = new ReachableVertices(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);

        graph.printReachableVertices(0);
    }
}