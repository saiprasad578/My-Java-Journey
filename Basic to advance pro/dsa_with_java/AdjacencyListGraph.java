import java.util.*;

public class AdjacencyListGraph {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    AdjacencyListGraph(int v) {
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

    void displayGraph() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        AdjacencyListGraph graph = new AdjacencyListGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        graph.displayGraph();
    }
}