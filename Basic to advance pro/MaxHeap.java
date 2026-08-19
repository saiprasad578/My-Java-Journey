public class MaxHeap {

    static class Heap {
        int[] heap;
        int size;

        Heap(int capacity) {
            heap = new int[capacity];
            size = 0;
        }

        void insert(int value) {

            if (size == heap.length) {
                System.out.println("Heap is full");
                return;
            }

            heap[size] = value;
            int index = size;
            size++;

            // Move element upward
            while (index > 0) {

                int parent = (index - 1) / 2;

                if (heap[parent] >= heap[index]) {
                    break;
                }

                int temp = heap[parent];
                heap[parent] = heap[index];
                heap[index] = temp;

                index = parent;
            }
        }

        int removeMax() {

            if (size == 0) {
                System.out.println("Heap is empty");
                return -1;
            }

            int max = heap[0];

            heap[0] = heap[size - 1];
            size--;

            // Move element downward
            int index = 0;

            while (true) {

                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int largest = index;

                if (left < size && heap[left] > heap[largest]) {
                    largest = left;
                }

                if (right < size && heap[right] > heap[largest]) {
                    largest = right;
                }

                if (largest == index) {
                    break;
                }

                int temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;

                index = largest;
            }

            return max;
        }

        void display() {

            System.out.print("Max Heap: ");

            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Heap maxHeap = new Heap(10);

        maxHeap.insert(40);
        maxHeap.insert(20);
        maxHeap.insert(60);
        maxHeap.insert(10);
        maxHeap.insert(50);

        maxHeap.display();

        System.out.println("Removed Maximum: "
                + maxHeap.removeMax());

        maxHeap.display();
    }
}