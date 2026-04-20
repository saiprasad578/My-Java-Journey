class Stack {
    int top;
    int max = 5;
    int arr[] = new int[max];

    Stack() {
        top = -1;
    }

    void push(int x) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top--] + " popped");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
    }
}