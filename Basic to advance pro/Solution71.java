import java.util.Scanner;

public class Solution71 {
    public static void main(String[] args) {
        int n;
        long fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}