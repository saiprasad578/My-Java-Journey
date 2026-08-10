import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String str = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}