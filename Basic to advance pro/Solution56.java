import java.util.*;

public class  Solution56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of points: ");
        int n = sc.nextInt();

        int[][] points = new int[n][2];

        // Taking input
        for(int i = 0; i < n; i++) {
            System.out.print("Enter x and y for point " + (i+1) + ": ");
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        // Print before sorting
        System.out.println("\nPoints before sorting:");
        for(int[] p : points) {
            System.out.println(p[0] + " " + p[1]);
        }

        // Sorting based on y coordinate
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        // Print after sorting
        System.out.println("\nPoints after sorting based on y value:");
        for(int[] p : points) {
            System.out.println(p[0] + " " + p[1]);
        }

        sc.close();
    }
}