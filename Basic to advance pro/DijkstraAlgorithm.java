import java.util.*;

public class DijkstraAlgorithm {

    static final int INF = Integer.MAX_VALUE;

    static void dijkstra(int[][] graph, int source) {

        int vertices = graph.length;

        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        // Initialize all distances to infinity
        for (int i = 0; i < vertices; i++) {
            distance[i] = INF;
        }

        distance[source] = 0;

        for (int count = 0; count < vertices - 1; count++) {

            int current = -1;

            // Find unvisited vertex with minimum distance
            for (int i = 0; i < vertices; i++) {

                if (!visited[i] &&
                    (current == -1 ||
                     distance[i] < distance[current])) {

                    current = i;
                }
            }

            if (current == -1) {
                break;
            }

            visited[current] = true;

            // Update neighboring vertices
            for (int i = 0; i < vertices; i++) {

                if (graph[current][i] != 0 &&
                    !visited[i] &&
                    distance[current] != INF &&
                    distance[current] + graph[current][i] < distance[i]) {

                    distance[i] =
                        distance[current] + graph[current][i];
                }
            }
        }

        System.out.println("Shortest distances from vertex " + source + ":");

        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 4, 1, 0, 0},
            {4, 0, 2, 5, 0},
            {1, 2, 0, 8, 10},
            {0, 5, 8, 0, 2},
            {0, 0, 10, 2, 0}
        };

        dijkstra(graph, 0);
    }
}