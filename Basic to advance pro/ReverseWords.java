public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String result = reverseWords(sentence);
        System.out.println("Reversed: " + result);
    }

    static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return sb.toString().trim();
    }
}
