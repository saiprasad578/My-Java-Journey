import java.util.Scanner;

public class Solution27 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the required number : ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("This is a bigger number : " + n);
        } else {
            System.out.println("This is smaller number : " + n);
        }

        System.out.println("Enter a new number:");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("This is a whole number");
        } 
        else if (a < 1) {
            System.out.println("This is a natural number");
        } 
        else if (a >= 0) {
            System.out.println("This is a real number");
        }

    }
}

