import java.util.*;

public class Solution80 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("Min Heap elements:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}