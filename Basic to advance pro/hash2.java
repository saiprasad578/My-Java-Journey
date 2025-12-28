public class hash2 {
    public static void main(String[] args) {
        String text = "JAVA";
        int hash = 0;

        for (int i = 0; i < text.length(); i++) {
            hash += text.charAt(i);
        }

        System.out.println("String: " + text);
        System.out.println("Hash Value: " + hash);
    }
}
