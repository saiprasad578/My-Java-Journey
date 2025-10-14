import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        // Input base of the triangle
        try (Scanner scanner = new Scanner(System.in)) {
            // Input base of the triangle
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            
            // Input height of the triangle
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            
            // Calculate area
            double area = 0.5 * base * height;
            System.out.println("Area of the triangle: " + area);
        }
    }
}
