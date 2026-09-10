import java.util.Scanner;

public class solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        } 
        else {
            balance = balance - amount;

            System.out.println("Please collect your cash");
            System.out.println("Remaining balance: " + balance);
        }

        sc.close();
    }
}