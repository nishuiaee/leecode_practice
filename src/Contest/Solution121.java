package Contest;

/**
 * @description: 121.买卖股票的最佳时间
 * @author: Yuner
 * @create: 2020-10-20 10:56
 **/
public class Solution121 {

    public int maxProfit (int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i],min);
            max = Math.max(prices[i] - min, max);
        }
        return max;
    }
}
