public class Solution84 {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;

        System.out.println("GCD: " + gcd(a, b));
    }
}