public class Floydwarshall {

    static final int INF = 99999;

    static void floydwarshall(int[][] graph) {

        int n = graph.length;

        int[][] distance = new int[n][n];

        // Copy graph into distance matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = graph[i][j];
            }
        }

        // Find shortest paths
        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (distance[i][k] != INF &&
                        distance[k][j] != INF &&
                        distance[i][k] + distance[k][j] < distance[i][j]) {

                        distance[i][j] =
                                distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        System.out.println("Shortest Distance Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (distance[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(distance[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0,   3,   INF, 7},
            {8,   0,   2,   INF},
            {5,   INF, 0,   1},
            {2,   INF, INF, 0}
        };

        floydWarshall(graph);
    }
}