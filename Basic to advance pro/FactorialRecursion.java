public class FactorialRecursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {   // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("Factorial = " + factorial(num));
    }
}