import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong Numbers:");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}