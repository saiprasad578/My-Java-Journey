import java.util.*;

public class GraphColoring {

    static int V = 4;

    static boolean isSafe(int vertex, int[][] graph,
                           int[] color, int c) {

        for (int i = 0; i < V; i++) {
            if (graph[vertex][i] == 1 && color[i] == c) {
                return false;
            }
        }

        return true;
    }

    static boolean graphColoring(int[][] graph, int m,
                                 int[] color, int vertex) {

        if (vertex == V) {
            return true;
        }

        for (int c = 1; c <= m; c++) {

            if (isSafe(vertex, graph, color, c)) {

                color[vertex] = c;

                if (graphColoring(graph, m, color, vertex + 1)) {
                    return true;
                }

                // Backtracking
                color[vertex] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0}
        };

        int m = 3;

        int[] color = new int[V];

        if (graphColoring(graph, m, color, 0)) {

            System.out.println("Graph can be colored using "
                    + m + " colors.");

            System.out.println("Vertex\tColor");

            for (int i = 0; i < V; i++) {
                System.out.println(i + "\t" + color[i]);
            }

        } else {
            System.out.println(
                    "Graph cannot be colored using " + m + " colors.");
        }
    }
}