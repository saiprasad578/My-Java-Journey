import java.util.Scanner;

public class AttendanceChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        System.out.print("Enter attended classes: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / total;

        System.out.println("Attendance: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for exam");
        } else {
            System.out.println("Not eligible for exam");
        }

        sc.close();
    }
}