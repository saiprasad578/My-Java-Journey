import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(10);
        s.push(15);

        System.out.println("Stack: " + s);

        s.pop();
        System.out.println("After pop: " + s);
    }
}
