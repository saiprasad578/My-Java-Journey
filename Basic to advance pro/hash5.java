public class hash5 {
    public static void main(String[] args) {
        int number = 456;
        int hash = 0;

        while (number > 0) {
            hash += number % 10;
            number /= 10;
        }

        System.out.println("Hash Value: " + hash);
    }
}
