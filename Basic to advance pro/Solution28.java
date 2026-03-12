import java.util.Scanner;

public class Solution28 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive: " + num);
        }
        else if (num < 0) {
            System.out.println("The number is Negative: " + num);
        }
        else {
            System.out.println("The number is Zero");
        }

        System.out.println("Enter another number:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The number is Even: " + a);
        }
        else {
            System.out.println("The number is Odd: " + a);
        }

    }
}