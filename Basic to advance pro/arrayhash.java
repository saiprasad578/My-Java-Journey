import java.util.Scanner;

public class ArrayHash {

    static int[] hashTable = new int[10];

    // Initialize table with -1 (means empty)
    static {
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = -1;
        }
    }

    // Insert with Linear Probing
    public static void insert(int key) {
        int index = key % hashTable.length;
        int originalIndex = index;

        while (hashTable[index] != -1) {
            index = (index + 1) % hashTable.length;
            if (index == originalIndex) {
                System.out.println("Hash Table is Full!");
                return;
            }
        }

        hashTable[index] = key;
        System.out.println("Key " + key + " inserted at index " + index);
    }

    // Search key
    public static void search(int key) {
        int index = key % hashTable.length;
        int originalIndex = index;

        while (hashTable[index] != -1) {
            if (hashTable[index] == key) {
                System.out.println("Key " + key + " found at index " + index);
                return;
            }
            index = (index + 1) % hashTable.length;
            if (index == originalIndex) break;
        }

        System.out.println("Key " + key + " not found.");
    }

    // Delete key
    public static void delete(int key) {
        int index = key % hashTable.length;
        int originalIndex = index;

        while (hashTable[index] != -1) {
            if (hashTable[index] == key) {
                hashTable[index] = -1;
                System.out.println("Key " + key + " deleted.");
                return;
            }
            index = (index + 1) % hashTable.length;
            if (index == originalIndex) break;
        }

        System.out.println("Key not found.");
    }

    // Display table
    public static void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        insert(25);
        insert(35);
        insert(45);

        display();

        search(35);
        delete(35);
        search(35);

        display();

        scanner.close();
    }
}
