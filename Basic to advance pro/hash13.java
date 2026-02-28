public class hash13 {

    public static int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        System.out.println(hash("hello"));
        System.out.println(hash("world"));
    }
}
