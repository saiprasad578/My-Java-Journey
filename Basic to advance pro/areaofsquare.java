import java.util.Scanner;

public class areaofsquare {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the side length of the square: ");
            double side = scanner.nextDouble();
            double area = side * side;
            double perimeter = 4 * side;
            
            System.out.println("Area of the square: " + area);
            System.out.println("Perimeter of the square: " + perimeter);
        }
    }
}
