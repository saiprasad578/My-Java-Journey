import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong password.");
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Account locked!");
            }
        }

        sc.close();
    }
}