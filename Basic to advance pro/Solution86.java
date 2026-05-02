public class Solution86 {
    
    static int countDigits(int n) {
        if (n == 0)
            return 1;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println("Number of digits in " + n + " is: " + countDigits(n));
    }
}
