class solution4 {
    public int minNumberOperations(int[] target) {
        int res = 0, prev = 0;
        for (int num : target) {
            if (num > prev) res += num - prev;
            prev = num;
        }
        return res;
    }
}
