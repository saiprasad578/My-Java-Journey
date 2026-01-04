public class hash11 {

    static int[] table = new int[10];
    static int DELETED = -2;

    static void initialize() {
        for (int i = 0; i < table.length; i++) {
            table[i] = -1;
        }
    }

    static void insert(int key) {
        int index = key % table.length;
        while (table[index] != -1 && table[index] != DELETED) {
            index = (index + 1) % table.length;
        }
        table[index] = key;
    }

    static void delete(int key) {
        int index = key % table.length;
        while (table[index] != -1) {
            if (table[index] == key) {
                table[index] = DELETED;
                System.out.println("Deleted " + key);
                return;
            }
            index = (index + 1) % table.length;
        }
        System.out.println("Key not found");
    }

    static void display() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + " : " + table[i]);
        }
    }

    public static void main(String[] args) {
        initialize();

        insert(10);
        insert(20);
        insert(30);

        delete(20);
        display();
    }
}
