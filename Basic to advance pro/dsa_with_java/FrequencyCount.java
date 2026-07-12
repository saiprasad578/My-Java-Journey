import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 2, 3, 5};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies:");
        for (Integer key : frequency.keySet()) {
            System.out.println(key + " -> " + frequency.get(key));
        }
    }
}