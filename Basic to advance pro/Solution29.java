import java.util.*;

public class Solution29 {

    class DSU {
        int[] parent;
        int[] rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // Path Compression
            }
            return parent[x];
        }

        void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);

            if (rootA != rootB) {

                if (rank[rootA] < rank[rootB]) {
                    parent[rootA] = rootB;
                } else if (rank[rootA] > rank[rootB]) {
                    parent[rootB] = rootA;
                } else {
                    parent[rootB] = rootA;
                    rank[rootA]++;
                }
            }
        }
    }

    public int maxMinPath(int n, int[][] edges) {

        // Sort edges by weight descending
        Arrays.sort(edges, (a, b) -> Integer.compare(b[2], a[2]));

        DSU dsu = new DSU(n);

        for (int[] edge : edges) {

            dsu.union(edge[0], edge[1]);

            if (dsu.find(0) == dsu.find(n - 1)) {
                return edge[2];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Solution29 sol = new Solution29();

        int n = 4;

        int[][] edges = {
            {0, 1, 8},
            {1, 2, 6},
            {0, 2, 4},
            {2, 3, 5},
            {1, 3, 3}
        };

        int result = sol.maxMinPath(n, edges);

        System.out.println("Maximum Minimum Path Value = " + result);
    }
}