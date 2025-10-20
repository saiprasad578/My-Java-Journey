import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        Character result = firstNonRepeatedChar(str);

        if (result != null)
            System.out.println("First non-repeated character: " + result);
        else
            System.out.println("No unique character found.");
    }

    static Character firstNonRepeatedChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return null;
    }
}
