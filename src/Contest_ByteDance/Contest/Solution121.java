package Contest_ByteDance.Contest;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-28 14:26
 **/
public class Solution121 {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE, maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}
