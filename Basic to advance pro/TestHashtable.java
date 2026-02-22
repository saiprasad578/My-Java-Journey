import java.util.Hashtable;

public class TestHashtable {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Apple");
        ht.put(2, "Banana");
        ht.put(3, "Mango");

        System.out.println(ht);

        System.out.println("Value for key 2: " + ht.get(2));
    }
}