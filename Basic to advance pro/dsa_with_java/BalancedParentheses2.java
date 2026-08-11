import java.util.*;

public class BalancedParentheses2 {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        if (isBalanced(str)) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }
    }
}