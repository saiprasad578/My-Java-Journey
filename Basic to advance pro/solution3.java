public class solution3 {
    public boolean hasSumDivisibleByFive(String s) {
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                next.append((a * b) % 10);
            }
            s = next.toString();
        }
        int sum = (s.charAt(0) - '0') + (s.charAt(1) - '0');
        return sum % 5 == 0;
    }
}
