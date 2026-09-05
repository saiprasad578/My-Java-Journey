import java.util.*;

public class BellmanFord {

    static void findShortestPath(int vertices, int[][] edges, int source) {

        int[] distance = new int[vertices];

        // Initialize distances
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        // Relax all edges V - 1 times
        for (int i = 1; i < vertices; i++) {

            for (int[] edge : edges) {

                int from = edge[0];
                int to = edge[1];
                int weight = edge[2];

                if (distance[from] != Integer.MAX_VALUE &&
                    distance[from] + weight < distance[to]) {

                    distance[to] = distance[from] + weight;
                }
            }
        }

        // Check for negative weight cycle
        for (int[] edge : edges) {

            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            if (distance[from] != Integer.MAX_VALUE &&
                distance[from] + weight < distance[to]) {

                System.out.println("Negative weight cycle detected!");
                return;
            }
        }

        System.out.println("Shortest distances from source " + source + ":");

        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        // {from, to, weight}
        int[][] edges = {
            {0, 1, 6},
            {0, 2, 7},
            {1, 2, 8},
            {1, 3, 5},
            {1, 4, -4},
            {2, 3, -3},
            {2, 4, 9},
            {3, 1, -2},
            {4, 3, 7}
        };

        findShortestPath(vertices, edges, 0);
    }
}