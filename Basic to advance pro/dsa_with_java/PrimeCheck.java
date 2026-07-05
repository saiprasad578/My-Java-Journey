import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        // FIXED: Changed System.class to System.in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
       
        if (number <= 1) {
            isPrime = false;
        } else {
            
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break;
                }
            }
        }
        
     
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
        
        scanner.close();
    }
}