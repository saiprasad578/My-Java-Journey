public class SimpleHash {
    public static void main(String[] args) {
        int number = 12345;
        int tableSize = 10;

        int hash = number % tableSize;

        System.out.println("Number: " + number);
        System.out.println("Hash Value: " + hash);
    }
}
