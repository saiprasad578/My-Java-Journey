import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        String str = "Java";
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}