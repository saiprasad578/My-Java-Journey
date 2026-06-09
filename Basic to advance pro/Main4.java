import java.util.ArrayDeque;
import java.util.Deque;

public class Main4 { 

    public static boolean isBalanced(String str) {
        // Use ArrayDeque instead of Stack for better performance
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            // When an opening bracket is found, push its matching closing bracket
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were correctly matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";

        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}