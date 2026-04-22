class Queue {
    int front, rear, max = 5;
    int arr[] = new int[max];

    Queue() {
        front = 0;
        rear = -1;
    }

    void enqueue(int x) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
        } else {
            arr[++rear] = x;
            System.out.println(x + " inserted");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front++] + " removed");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
    }
}