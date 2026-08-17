public class QueueExample {

    static class Queue {
        int[] arr;
        int front;
        int rear;
        int size;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            front = 0;
            rear = -1;
        }

        void enqueue(int value) {

            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }

            rear++;
            arr[rear] = value;

            System.out.println(value + " added to queue");
        }

        void dequeue() {

            if (front > rear) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println(arr[front] + " removed from queue");
            front++;
        }

        void display() {

            if (front > rear) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue: ");

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
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

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}