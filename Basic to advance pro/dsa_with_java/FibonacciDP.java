import java.util.Scanner;

public class FibonacciDP {
    static int[] dp = new int[100];

    static int fibonacci(int n) {
        if (n <= 1)
            return n;

        if (dp[n] != 0)
            return dp[n];

        dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Number: " + fibonacci(n));
    }
}