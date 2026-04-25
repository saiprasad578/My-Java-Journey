import java.util.*;

public class git {
    static class Commit {
        String hash;
        String author;
        String message;

        Commit(String hash, String author, String message) {
            this.hash = hash;
            this.author = author;
            this.message = message;
        }

        void display() {
            System.out.println("Commit: " + hash);
            System.out.println("Author: " + author);
            System.out.println("Message: " + message);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Repository Name: ");
        String repo = sc.nextLine();

        System.out.print("Enter Branch Name: ");
        String branch = sc.nextLine();

        System.out.print("Enter number of commits: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ArrayList<Commit> commits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for commit " + (i + 1));

            System.out.print("Commit Hash: ");
            String hash = sc.nextLine();

            System.out.print("Author Name: ");
            String author = sc.nextLine();

            System.out.print("Commit Message: ");
            String message = sc.nextLine();

            commits.add(new Commit(hash, author, message));
        }

        // Display
        System.out.println("\n===== Repository Info =====");
        System.out.println("Repository: " + repo);
        System.out.println("Branch: " + branch);

        System.out.println("\n===== Commit History =====");
        for (Commit c : commits) {
            c.display();
        }

        sc.close();
    }
}