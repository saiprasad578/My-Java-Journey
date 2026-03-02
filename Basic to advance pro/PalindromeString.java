import java.util.Scanner;

public class PalindromeString {

    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();   // ignore case
        
        String rev = new StringBuilder(str).reverse().toString();
        
        return str.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}