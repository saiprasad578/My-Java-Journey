import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
        }

        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        System.out.println("The " + k + "th smallest element is: " + pq.peek());

        sc.close();
    }
}