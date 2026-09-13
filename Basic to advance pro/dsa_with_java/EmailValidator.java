import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        sc.close();
    }
}