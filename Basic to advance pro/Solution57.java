import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution57 {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        
        // Initialize arrays with -1 to track characters not present
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        // Find the first and last index for every character 'a' - 'z'
        for (int i = 0; i < n; i++) {
            int curr = s.charAt(i) - 'a';
            if (first[curr] == -1) {
                first[curr] = i;
            }
            last[curr] = i;
        }

        int res = 0;
        // For each character, if it appears at least twice, 
        // find all unique characters between its first and last occurrence.
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] > first[i]) {
                Set<Character> between = new HashSet<>();
                for (int j = first[i] + 1; j < last[i]; j++) {
                    between.add(s.charAt(j));
                }
                res += between.size();
            }
        }

        return res;
    }
}