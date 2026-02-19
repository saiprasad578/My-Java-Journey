class Method2 {
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        Method2 calc = new Method2();

        System.out.println("Product of two integers: " + calc.multiply(5, 4));
        System.out.println("Product of three integers: " + calc.multiply(2, 3, 4));
        System.out.println("Product of two doubles: " + calc.multiply(2.5, 4.5));
    }
}
