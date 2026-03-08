import java.util.Scanner;

class Solution21 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        float b = sc.nextFloat();

        System.out.println("Sum: " + (a + b));
        System.out.println("Concatenation: " + a + "" + b);
        System.out.println("Double Sum: " + ((a + b) * 2));
    }
}