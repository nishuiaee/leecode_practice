package Practice10_14;

/**
 * @description: 买卖股票的最佳时机
 * @author: Yuner
 * @create: 2020-10-14 16:45
 **/
public class Practice3 {
    public int maxProfit(int[] prices) {
       int minprice = Integer.MAX_VALUE;
       int maxpricae = 0;
       for (int i = 0; i < prices.length; i++) {
           minprice = Math.min(minprice, prices[i]);
           prices[i] = prices[i] - minprice;
           maxpricae = Math.max(maxpricae, prices[i]);
       }
       return maxpricae;
    }
}
