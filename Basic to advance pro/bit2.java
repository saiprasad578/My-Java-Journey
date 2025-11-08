public class bit2 {
    public static int minimumOneBitOperations(int n) {
        int ans = 0;
        while (n != 0) {
            ans ^= n;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumOneBitOperations(3));
        System.out.println(minimumOneBitOperations(6));
        System.out.println(minimumOneBitOperations(9));
        System.out.println(minimumOneBitOperations(15));
    }
}
