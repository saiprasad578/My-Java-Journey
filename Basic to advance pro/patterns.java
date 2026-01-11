public class patterns {

    public static void main(String[] args) {

        int n = 5;

        // 1. Left Triangle
        System.out.println("1. Left Triangle");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Reverse Left Triangle
        System.out.println("\n2. Reverse Left Triangle");
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. Butterfly Pattern 
        System.out.println("\n3. Butterfly Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int s = 1; s <= 2 * (n - i); s++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int s = 1; s <= 2 * (n - i); s++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // 4. Hourglass Pattern
        System.out.println("\n4. Hourglass Pattern");

        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // 5. Pascal Triangle
        System.out.println("\n5. Pascal Triangle");

        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // 6. Binary Pattern
        System.out.println("\n6. Binary Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        // 7. Hollow Pyramid
        System.out.println("\n7. Hollow Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
