public class solution2 {
    public boolean hasEvenDigits(String s) {
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                next.append(Math.abs(a - b));
            }
            s = next.toString();
        }
        int x = s.charAt(0) - '0';
        int y = s.charAt(1) - '0';
        return x % 2 == 0 && y % 2 == 0;
    }
}
