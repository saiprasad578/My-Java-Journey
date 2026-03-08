import java.util.*;

public class count2 {

    public static void main(String[] args) {

        int[][] points = {
            {1,2},
            {3,1},
            {2,4}
        };

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        for(int[] p : points){
            System.out.println(p[0] + " " + p[1]);
        }
    }
}