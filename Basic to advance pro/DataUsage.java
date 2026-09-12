import java.util.Scanner;

public class DataUsage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int limit = 2; // GB

        System.out.print("Enter today's data usage (GB): ");
        double used = sc.nextDouble();

        if (used > limit) {
            System.out.println("Data limit exceeded!");
        } else {
            double remaining = limit - used;
            System.out.println("Data remaining: " + remaining + " GB");
        }

        sc.close();
    }
}