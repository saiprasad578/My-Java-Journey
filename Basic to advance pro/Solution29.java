import java.util.*;

class Solution29 {

    class DSU {
        int[] parent;

        DSU(int n){
            parent = new int[n];
            for(int i=0;i<n;i++) parent[i]=i;
        }

        int find(int x){
            if(parent[x]!=x)
                parent[x]=find(parent[x]);
            return parent[x];
        }

        void union(int a,int b){
            parent[find(a)] = find(b);
        }
    }

    public int maxMinPath(int n, int[][] edges) {

        Arrays.sort(edges,(a,b)->b[2]-a[2]);

        DSU dsu = new DSU(n);

        for(int[] e:edges){

            dsu.union(e[0],e[1]);

            if(dsu.find(0)==dsu.find(n-1))
                return e[2];
        }

        return -1;
    }
}