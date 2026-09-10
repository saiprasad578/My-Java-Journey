import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*[0-9].*")) {

            System.out.println("Strong password");

        } else {
            System.out.println("Weak password");
        }

        sc.close();
    }
}