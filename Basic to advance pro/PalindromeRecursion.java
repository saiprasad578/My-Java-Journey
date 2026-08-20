public class PalindromeRecursion {

    static boolean isPalindrome(String str, int left, int right) {

        // Base case
        if (left >= right) {
            return true;
        }

        // Characters don't match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Move towards the center
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}