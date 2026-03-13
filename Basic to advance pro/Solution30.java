import java.util.*;

 class Solution30 {

    class DSU {
        int[] parent;

        DSU(int n){
            parent = new int[n+1];
            for(int i=1;i<=n;i++)
                parent[i] = i;
        }

        int find(int x){
            if(parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean union(int a,int b){
            int pa = find(a);
            int pb = find(b);

            if(pa == pb)
                return false;

            parent[pa] = pb;
            return true;
        }
    }

    public int minimumCost(int n, int[][] connections) {

        Arrays.sort(connections,(a,b)->a[2]-b[2]);

        DSU dsu = new DSU(n);

        int cost = 0;
        int edges = 0;

        for(int[] c:connections){

            if(dsu.union(c[0],c[1])){
                cost += c[2];
                edges++;
            }

            if(edges == n-1)
                return cost;
        }

        return -1;
    }
}