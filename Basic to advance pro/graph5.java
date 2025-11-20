import java.util.*;
class graph5 {
    public static void main(String[] a) {
        int n = 4;
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<n;i++) g.add(new ArrayList<>());
        g.get(0).add(1);
        g.get(0).add(2);
        g.get(1).add(3);
        g.get(2).add(3);
        for(int i=0;i<n;i++)
            System.out.println(i+" -> "+g.get(i));
    }
}
