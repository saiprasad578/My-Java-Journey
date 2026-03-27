import java.util.*;

class Solution29 {

    class DSU {
        int[] parent;
        int[] rank;

        DSU(int n){
            parent = new int[n];
            rank = new int[n];

            for(int i = 0; i < n; i++){
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]); // path compression
            }
            return parent[x];
        }

        void union(int a, int b){
            int rootA = find(a);
            int rootB = find(b);

            if(rootA != rootB){
                // union by rank
                if(rank[rootA] < rank[rootB]){
                    parent[rootA] = rootB;
                } else if(rank[rootA] > rank[rootB]){
                    parent[rootB] = rootA;
                } else {
                    parent[rootB] = rootA;
                    rank[rootA]++;
                }
            }
        }
    }

    public int maxMinPath(int n, int[][] edges) {

        // Sort edges in descending order based on weight
        Arrays.sort(edges, (a, b) -> Integer.compare(b[2], a[2]));

        DSU dsu = new DSU(n);

        for(int[] e : edges){
            dsu.union(e[0], e[1]);

            // Check if 0 and n-1 are connected
            if(dsu.find(0) == dsu.find(n - 1)){
                return e[2];
            }
        }

        return -1;
    }
}