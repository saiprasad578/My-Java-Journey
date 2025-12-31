public class hash7 {
    public static int hash(String s) {
        long h = 1469598103934665603L;
        long p = 1099511628211L;
        for (int i = 0; i < s.length(); i++) {
            h ^= s.charAt(i);
            h *= p;
            h ^= (h >>> 32);
        }
        return (int)(h ^ (h >>> 16));
    }

    public static void main(String[] args) {
        System.out.println(hash("example"));
    }
}
