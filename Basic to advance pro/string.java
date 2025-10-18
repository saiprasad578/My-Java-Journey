public class string {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        int length = greeting.length();
        String upperCaseGreeting = greeting.toUpperCase();
        String subString = greeting.substring(7, 12);

        System.out.println("Original String: " + greeting);
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + upperCaseGreeting);
        System.out.println("Substring: " + subString);
        
    }
}