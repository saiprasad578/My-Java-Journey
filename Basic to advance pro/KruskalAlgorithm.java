import java.util.*;

public class KruskalAlgorithm {

    static class Edge {
        int source, destination, weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent, parent[vertex]);
        }

        return parent[vertex];
    }

    static void union(int[] parent, int[] rank, int a, int b) {

        int rootA = find(parent, a);
        int rootB = find(parent, b);

        if (rootA == rootB) {
            return;
        }

        if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }
    }

    static void kruskal(int vertices, ArrayList<Edge> edges) {

        edges.sort(Comparator.comparingInt(e -> e.weight));

        int[] parent = new int[vertices];
        int[] rank = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }

        int totalWeight = 0;
        int edgesUsed = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (Edge edge : edges) {

            int root1 = find(parent, edge.source);
            int root2 = find(parent, edge.destination);

            // Add edge only if it does not create a cycle
            if (root1 != root2) {

                union(parent, rank, root1, root2);

                System.out.println(
                    edge.source + " - " +
                    edge.destination + " : " +
                    edge.weight
                );

                totalWeight += edge.weight;
                edgesUsed++;

                if (edgesUsed == vertices - 1) {
                    break;
                }
            }
        }

        System.out.println("Minimum Cost: " + totalWeight);
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        kruskal(vertices, edges);
    }
}