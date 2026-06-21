class Solution147 {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;

        // Find maximum cost
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }

        // Frequency array
        int[] freq = new int[maxCost + 1];

        // Count frequencies
        for (int cost : costs) {
            freq[cost]++;
        }

        int count = 0;

        // Buy cheapest ice creams first
        for (int cost = 1; cost <= maxCost; cost++) {
            if (freq[cost] == 0) continue;

            int canBuy = Math.min(freq[cost], coins / cost);

            count += canBuy;
            coins -= canBuy * cost;
        }

        return count;
    }
}