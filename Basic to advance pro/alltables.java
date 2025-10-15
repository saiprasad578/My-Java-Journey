public class alltables{
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("Multiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
            System.out.println(); // Print a blank line between tables
        }
    }
}