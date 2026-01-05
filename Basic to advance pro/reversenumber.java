public class reversenumber {
    public static void main(String[] args) {
        int num = 1234, reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
