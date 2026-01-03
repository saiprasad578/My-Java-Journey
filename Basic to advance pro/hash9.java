import java.util.LinkedList;

public class hash9 {

    static int SIZE = 10;
    static LinkedList<Integer>[] table = new LinkedList[SIZE];

    static void initialize() {
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    static void insert(int key) {
        int index = key % SIZE;
        table[index].add(key);
    }

    static void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " : ");
            for (int key : table[i]) {
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        initialize();

        insert(15);
        insert(25);
        insert(35);
        insert(45);

        display();
    }
}
