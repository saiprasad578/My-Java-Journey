import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate

        System.out.println("HashSet values:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
