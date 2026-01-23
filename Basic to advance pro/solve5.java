class solve5 {
    public boolean almostPalindrome(int x) {
        if (x < 0) return false;

        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        return check(x, div, false);
    }

    private boolean check(int x, int div, boolean skipped) {
        if (x < 10) return true;

        int left = x / div;
        int right = x % 10;

        if (left == right) {
            return check((x % div) / 10, div / 100, skipped);
        }

        if (skipped) return false;

        // Try skipping left OR skipping right
        return check(x % div, div / 10, true) ||
               check(x / 10, div / 10, true);
    }
}
