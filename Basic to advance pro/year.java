import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class YearDetails {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get century with suffix
    public static String getCentury(int year) {
        int century = (year - 1) / 100 + 1;
        String suffix;

        if (century % 100 >= 11 && century % 100 <= 13) {
            suffix = "th";
        } else {
            switch (century % 10) {
                case 1: suffix = "st"; break;
                case 2: suffix = "nd"; break;
                case 3: suffix = "rd"; break;
                default: suffix = "th";
            }
        }

        return century + suffix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a year (or 0 to exit): ");
            int year = scanner.nextInt();

            if (year == 0) {
                System.out.println("Program Ended.");
                break;
            }

            if (year < 0) {
                System.out.println("Invalid year! Please enter a positive year.");
                continue;
            }

            int yearCode = year % 100;
            boolean leap = isLeapYear(year);
            int totalDays = leap ? 366 : 365;

            LocalDate date = LocalDate.of(year, 1, 1);
            DayOfWeek day = date.getDayOfWeek();

            System.out.println("Year: " + year);
            System.out.println("Year Code (last two digits): " + yearCode);
            System.out.println("Century: " + getCentury(year));
            System.out.println("Leap Year: " + (leap ? "Yes" : "No"));
            System.out.println("Total Days: " + totalDays);
            System.out.println("January 1st falls on: " + day);
        }

        scanner.close();
    }
}