import java.util.Scanner;

public class Solution72 {
    public static void main(String[] args) {
        int n, i;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }
}