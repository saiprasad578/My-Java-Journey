public class StringHashExample {
    public static void main(String[] args) {
        String text = "HelloJava";

        int hashValue = text.hashCode();

        System.out.println("String: " + text);
        System.out.println("Hash Value: " + hashValue);
    }
}
