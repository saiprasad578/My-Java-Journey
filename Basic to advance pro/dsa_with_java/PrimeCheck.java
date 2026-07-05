import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors up to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break;
                }
            }
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
        
        scanner.close();
    }
}