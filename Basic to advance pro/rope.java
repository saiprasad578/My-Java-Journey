class rope {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int maxTime = 0;

        for (int i = 0; i < colors.length(); i++) {
            if (i == 0 || colors.charAt(i) != colors.charAt(i - 1)) {
                maxTime = neededTime[i];
            } else {
                totalTime += Math.min(maxTime, neededTime[i]);
                maxTime = Math.max(maxTime, neededTime[i]);
            }
        }

        return totalTime;
    }
}
