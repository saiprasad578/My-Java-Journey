
import java.io.InputStream;

public class game {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        System.out.println("enter any number from 1 to 99");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);
    }

    private static class Scanner {
        public Scanner(InputStream in) {
        }

        public int nextInt() {
            return 0; 
        }
    }
}

        