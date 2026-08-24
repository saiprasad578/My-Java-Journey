public class CircularQueue {

    static class Queue {
        int[] arr;
        int front;
        int rear;
        int size;
        int count;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            front = 0;
            rear = -1;
            count = 0;
        }

        void enqueue(int value) {

            if (count == size) {
                System.out.println("Queue is Full");
                return;
            }

            rear = (rear + 1) % size;
            arr[rear] = value;
            count++;

            System.out.println(value + " inserted");
        }

        void dequeue() {

            if (count == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println(arr[front] + " removed");

            front = (front + 1) % size;
            count--;
        }

        void display() {

            if (count == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue: ");

            for (int i = 0; i < count; i++) {
                int index = (front + i) % size;
                System.out.print(arr[index] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();
    }
}