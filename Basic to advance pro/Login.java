import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "java123";

        for (int i = 1; i <= 3; i++) {

            System.out.print("Username: ");
            String user = sc.nextLine();

            System.out.print("Password: ");
            String pass = sc.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Login successful!");
                break;
            }

            System.out.println("Invalid login.");

            if (i == 3) {
                System.out.println("Account locked.");
            }
        }

        sc.close();
    }
}