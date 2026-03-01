class DSA {

    // Feature 1: Check palindrome using String (improved)
    public boolean isPalindromeString(int x) {
        if (x < 0) return false; // negative numbers are not palindrome

        String s = Integer.toString(x);
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    // Feature 2: Check palindrome WITHOUT converting to String (Optimized)
    public boolean isPalindromeNumber(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }

    // Feature 3: Reverse a number safely
    public int reverseNumber(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check overflow
            if (reversed > Integer.MAX_VALUE / 10 || 
               (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            if (reversed < Integer.MIN_VALUE / 10 || 
               (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed;
    }
}