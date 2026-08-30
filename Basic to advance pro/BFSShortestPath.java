import java.util.*;

public class BFSShortestPath {

    static void shortestPath(
            ArrayList<ArrayList<Integer>> graph,
            int source) {

        int vertices = graph.size();

        int[] distance = new int[vertices];

        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        distance[source] = 0;
        queue.add(source);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int neighbor : graph.get(current)) {

                if (distance[neighbor] == -1) {

                    distance[neighbor] =
                            distance[current] + 1;

                    queue.add(neighbor);
                }
            }
        }

        System.out.println(
                "Shortest distances from vertex " + source + ":");

        for (int i = 0; i < vertices; i++) {
            System.out.println(
                    "Vertex " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(5);

        graph.get(4).add(2);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        shortestPath(graph, 0);
    }
}