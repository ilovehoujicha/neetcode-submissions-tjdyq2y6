class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int lowest = 100;
        for (int i = 0; i < prices.length; i++) {
            lowest = Math.min(lowest, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - lowest);
        }
        return max_profit;
    }
}
