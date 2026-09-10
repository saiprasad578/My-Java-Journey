import java.io.*;

public class WordCounter {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            int words = 0;

            while (sc.hasNext()) {
                sc.next();
                words++;
            }

            System.out.println("Total words: " + words);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}