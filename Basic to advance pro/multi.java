import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Multiplication
        int c = a * b;

        // Display result
        System.out.println("Multiplication of " + a + " and " + b + " is: " + c);

        sc.close();
    }
}