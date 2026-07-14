import java.util.Stack;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "HELLO";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        System.out.print("Reversed String: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}