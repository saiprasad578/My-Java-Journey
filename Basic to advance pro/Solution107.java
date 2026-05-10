import java.util.HashMap;
import java.util.Map;

class Solution107 {
    public int[] countValidWords(String[] chunks, String[] queries) {
        // 1. Concatenate all chunks to form the string s
        StringBuilder sb = new StringBuilder();
        for (String chunk : chunks) {
            sb.append(chunk);
        }
        String s = sb.toString();
        int n = s.length();
        
        // 2. Parse the string and count occurrences of valid words
        Map<String, Integer> wordCount = new HashMap<>();
        StringBuilder currentWord = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                // Lowercase letters are always part of a word
                currentWord.append(c);
            } else if (c == '-') {
                // Check if the hyphen is valid (surrounded by lowercase letters)
                boolean isValidHyphen = (i > 0 && i < n - 1 
                                         && Character.isLowerCase(s.charAt(i - 1)) 
                                         && Character.isLowerCase(s.charAt(i + 1)));
                
                if (isValidHyphen) {
                    currentWord.append(c);
                } else {
                    // Invalid hyphen acts as a separator
                    addWordToMap(currentWord, wordCount);
                }
            } else {
                // Any other character acts as a separator
                addWordToMap(currentWord, wordCount);
            }
        }
        
        // Don't forget to add the final word if the string ends with one
        addWordToMap(currentWord, wordCount);
        
        // 3. Process the queries against our frequency map
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = wordCount.getOrDefault(queries[i], 0);
        }
        
        return ans;
    }
    
    // Helper method to add the valid word to the frequency map and reset the builder
    private void addWordToMap(StringBuilder currentWord, Map<String, Integer> wordCount) {
        if (currentWord.length() > 0) {
            String word = currentWord.toString();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            currentWord.setLength(0); // Clear the builder for the next word
        }
    }
}