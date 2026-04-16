import java.util.Scanner;

public class Solution67 {
    public static void main(String[] args) {
        int num, i;
        long fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}