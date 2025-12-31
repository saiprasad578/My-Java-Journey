public class hash8 {
    public static int hash(String s) {
        int h = 7;
        for (int i = 0; i < s.length(); i++) {
            h = (h << 5) - h + s.charAt(i);
            h ^= (h >>> 13);
        }
        return h;
    }

    public static void main(String[] args) {
        System.out.println(hash("example"));
    }
}
