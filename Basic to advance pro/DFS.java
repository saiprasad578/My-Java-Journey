import java.util.*;

public class DFS {
    private LinkedList<Integer> adj[];

    DFS(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfsUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    void dfs(int start) {
        boolean visited[] = new boolean[adj.length];
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