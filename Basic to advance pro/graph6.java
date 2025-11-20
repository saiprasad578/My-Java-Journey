import java.util.*;
class graph6 {
    static void dfs(int u, List<List<Integer>> g, boolean[] v){
        v[u]=true;
        System.out.print(u+" ");
        for(int x:g.get(u)) if(!v[x]) dfs(x,g,v);
    }
    public static void main(String[] a){
        int n=5;
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++) g.add(new ArrayList<>());
        g.get(0).add(1); g.get(0).add(2);
        g.get(1).add(3); g.get(2).add(4);
        boolean[] v=new boolean[n];
        dfs(0,g,v);
    }
}
