import java.util.Scanner;

public class num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking number
        if (number > 0) {
            System.out.println(number + " is a Positive number.");
        } 
        else if (number < 0) {
            System.out.println(number + " is a Negative number.");
        } 
        else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}