import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Year code (last two digits)
        int yearCode = year % 100;

        // Calculate century
        int century = (year / 100) + (year % 100 == 0 ? 0 : 1);

        // Check leap year
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        // Output results
        System.out.println("Year: " + year);
        System.out.println("Year Code (last two digits): " + yearCode);
        System.out.println("Century: " + century);
        System.out.println("Leap Year: " + (isLeap ? "Yes" : "No"));

        scanner.close();
    }
}
