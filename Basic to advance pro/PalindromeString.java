import java.util.Scanner;

public class PalindromeString {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        
        // Remove special characters and spaces
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or type 'exit' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program Ended.");
                break;
            }

            if (isPalindrome(input))
                System.out.println("Palindrome ");
            else
                System.out.println("Not Palindrome ");

            System.out.println();
        }

        sc.close();
    }
}