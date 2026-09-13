import java.util.Scanner;

public class OTPVerification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctOTP = 1234;

        System.out.print("Enter OTP: ");
        int otp = sc.nextInt();

        if (otp == correctOTP) {
            System.out.println("OTP verified successfully.");
        } else {
            System.out.println("Invalid OTP.");
        }

        sc.close();
    }
}