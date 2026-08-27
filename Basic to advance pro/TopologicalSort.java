import java.util.*;

public class TopologicalSort {

    static void topologicalSort(int vertices, int[][] graph) {

        int[] indegree = new int[vertices];

        // Calculate indegree of each vertex
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] == 1) {
                    indegree[j]++;
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add vertices with indegree 0
        for (int i = 0; i < vertices; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;

        System.out.print("Topological Order: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");
            count++;

            // Remove current vertex's outgoing edges
            for (int i = 0; i < vertices; i++) {

                if (graph[current][i] == 1) {
                    indegree[i]--;

                    if (indegree[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }

        // If not all vertices are processed, graph has a cycle
        if (count != vertices) {
            System.out.println("\nGraph contains a cycle!");
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0}
        };

        topologicalSort(vertices, graph);
    }
}