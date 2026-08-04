public class BellmanFord {

    static class Edge {
        int source, destination, weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void bellmanFord(Edge[] edges, int vertices, int edgeCount, int source) {

        int[] distance = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[source] = 0;

        // Relax all edges (V-1) times
        for (int i = 1; i < vertices; i++) {
            for (int j = 0; j < edgeCount; j++) {
                int u = edges[j].source;
                int v = edges[j].destination;
                int w = edges[j].weight;

                if (distance[u] != Integer.MAX_VALUE &&
                        distance[u] + w < distance[v]) {
                    distance[v] = distance[u] + w;
                }
            }
        }

        // Check for negative weight cycle
        for (int j = 0; j < edgeCount; j++) {
            int u = edges[j].source;
            int v = edges[j].destination;
            int w = edges[j].weight;

            if (distance[u] != Integer.MAX_VALUE &&
                    distance[u] + w < distance[v]) {
                System.out.println("Graph contains a negative weight cycle.");
                return;
            }
        }

        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t" + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 5;
        int edgeCount = 8;

        Edge[] edges = new Edge[edgeCount];

        edges[0] = new Edge(0, 1, -1);
        edges[1] = new Edge(0, 2, 4);
        edges[2] = new Edge(1, 2, 3);
        edges[3] = new Edge(1, 3, 2);
        edges[4] = new Edge(1, 4, 2);
        edges[5] = new Edge(3, 2, 5);
        edges[6] = new Edge(3, 1, 1);
        edges[7] = new Edge(4, 3, -3);

        bellmanFord(edges, vertices, edgeCount, 0);
    }
}