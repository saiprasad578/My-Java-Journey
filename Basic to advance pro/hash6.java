public class hash6 {

    static int[] table = new int[10];

    // Initialize table with -1
    static void initialize() {
        for (int i = 0; i < table.length; i++) {
            table[i] = -1;
        }
    }

    static void insert(int key) {
        int index = key % table.length;

        // Linear probing
        while (table[index] != -1) {
            index = (index + 1) % table.length;
        }
        table[index] = key;
    }

    static void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + " : " + table[i]);
        }
    }

    public static void main(String[] args) {
        initialize();

        insert(12);
        insert(22);
        insert(32);
        insert(42);

        display();
    }
}
