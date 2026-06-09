public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int maxLength = 0;
        String longestSub = "";

        // Outer loop sets the starting point of the substring
        for (int i = 0; i < input.length(); i++) {
            boolean[] visited = new boolean[256]; // Track characters in current window
            StringBuilder currentSub = new StringBuilder();

            // Inner loop extends the substring as far as possible
            for (int j = i; j < input.length(); j++) {
                char currentChar = input.charAt(j);

                // If character is repeated, break the inner loop
                if (visited[currentChar]) {
                    break;
                } else {
                    visited[currentChar] = true;
                    currentSub.append(currentChar);
                    
                    // Update maximum length found so far
                    if (currentSub.length() > maxLength) {
                        maxLength = currentSub.length();
                        longestSub = currentSub.toString();
                    }
                }
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Length of longest non-repeating substring: " + maxLength);
        System.out.println("Sub-string is: \"" + longestSub + "\"");
    }
}