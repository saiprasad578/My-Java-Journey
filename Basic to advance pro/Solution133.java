import java.util.Scanner;

public class Solution133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;

        int reverse = a * 100 + b * 10 + c;

        System.out.println(reverse);
    }
}