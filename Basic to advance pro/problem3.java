class problem3 {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        long sum = 0, sumSq = 0;
        for (int x : nums) {
            sum += x;
            sumSq += (long) x * x;
        }
        long expectedSum = (long) n * (n - 1) / 2;
        long expectedSq = (long) n * (n - 1) * (2L * n - 1) / 6;
        long diff = sum - expectedSum;
        long diffSq = sumSq - expectedSq;
        long sumDup = diffSq / diff;
        int a = (int) ((diff + sumDup) / 2);
        int b = (int) (sumDup - a);
        return new int[]{a, b};
    }
}
