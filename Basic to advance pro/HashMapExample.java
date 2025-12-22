import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("All values: " + map);
    }
}
