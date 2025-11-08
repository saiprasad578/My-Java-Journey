public class bit3 {
    public static int minimumOneBitOperations(int n) {
        if (n == 0) return 0;
        int k = 0;
        while ((1 << (k + 1)) <= n) k++;
        return (1 << (k + 1)) - 1 - minimumOneBitOperations(n ^ (1 << k));
    }

    public static void main(String[] args) {
        System.out.println(minimumOneBitOperations(3));
        System.out.println(minimumOneBitOperations(6));
        System.out.println(minimumOneBitOperations(9));
        System.out.println(minimumOneBitOperations(12));
    }
}
