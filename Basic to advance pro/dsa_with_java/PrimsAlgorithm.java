import java.util.*;

public class PrimsAlgorithm {

    static final int INF = 999999;

    static void prims(int[][] graph) {

        int vertices = graph.length;

        int[] key = new int[vertices];
        int[] parent = new int[vertices];
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            key[i] = INF;
            parent[i] = -1;
        }

        key[0] = 0;

        for (int count = 0; count < vertices; count++) {

            int current = -1;

            // Find vertex with minimum key
            for (int i = 0; i < vertices; i++) {
                if (!visited[i] &&
                    (current == -1 || key[i] < key[current])) {
                    current = i;
                }
            }

            visited[current] = true;

            // Update adjacent vertices
            for (int i = 0; i < vertices; i++) {

                if (graph[current][i] != 0 &&
                    !visited[i] &&
                    graph[current][i] < key[i]) {

                    key[i] = graph[current][i];
                    parent[i] = current;
                }
            }
        }

        int totalCost = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (int i = 1; i < vertices; i++) {

            System.out.println(
                parent[i] + " - " + i +
                " : " + graph[i][parent[i]]
            );

            totalCost += graph[i][parent[i]];
        }

        System.out.println("Minimum Cost: " + totalCost);
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        prims(graph);
    }
}