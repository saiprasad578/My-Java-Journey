import java.util.Scanner;

public class Solution66 {
    public static void main(String[] args) {
        int num, i, flag = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not a Prime Number");
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                System.out.println("Prime Number");
            else
                System.out.println("Not a Prime Number");
        }
    }
}