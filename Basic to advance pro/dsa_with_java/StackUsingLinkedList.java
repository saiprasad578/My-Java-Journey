public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        // Push element
        void push(int value) {
            Node newNode = new Node(value);

            newNode.next = top;
            top = newNode;

            System.out.println(value + " pushed");
        }

        // Pop element
        void pop() {

            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.println(top.data + " popped");
            top = top.next;
        }

        // Peek top element
        void peek() {

            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.println("Top element: " + top.data);
        }

        // Display stack
        void display() {

            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node current = top;

            System.out.print("Stack: ");

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}