package DynamicProgramming;

//121.买卖股票的最佳时机
public class Solution121 {

    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            cost = Math.min(prices[i],cost);
            profit = Math.max(profit,prices[i] - cost);
        }

        return profit;
    }
}
