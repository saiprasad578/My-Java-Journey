public class arrayhash {
    public static void main(String[] args) {
        int[] hashTable = new int[10];
        int key = 25;

        int index = key % hashTable.length;
        hashTable[index] = key;

        System.out.println("Key: " + key);
        System.out.println("Stored at index: " + index);
    }
}
