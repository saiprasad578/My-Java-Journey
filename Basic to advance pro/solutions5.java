class solutions5 {
    public int minNumberOperations(int[] target) {
        int n = target.length, res = target[0];
        for (int i = 1; i < n; i++) {
            int diff = target[i] - target[i - 1];
            if (diff > 0) res += diff;
        }
        return res;
    }
}
