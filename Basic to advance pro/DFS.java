import java.util.*;

public class DFS {
    private ArrayList<LinkedList<Integer>> adj;

    DFS(int v) {
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<>());
        }
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    void dfsUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj.get(v)) {
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    void dfs(int start) {
        boolean visited[] = new boolean[adj.size()];
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        DFS g = new DFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("DFS Traversal:");
        g.dfs(0);
    }
}