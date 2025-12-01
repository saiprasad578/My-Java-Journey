public class dsa2 {

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int[] testValues = {121, -121, 10, 1221, 12321, 123, 1001, -101, 0, 2147447412, 100};

        for (int x : testValues) {
            System.out.println("Input: " + x + " → Output: " + isPalindrome(x));
        }
    }
}
