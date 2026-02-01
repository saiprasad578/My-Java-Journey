class plus_one {
    public int[] plusOne(int[] digits) {
        // Traverse from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;     // simple increment
                return digits;
            }
            digits[i] = 0;       // handle carry
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;           // e.g., [9] -> [1,0]
        return result;
    }
}
