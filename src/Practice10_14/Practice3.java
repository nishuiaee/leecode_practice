package Practice10_14;

/**
 * @description: 买卖股票的最佳时机
 * @author: Yuner
 * @create: 2020-10-14 16:45
 **/
public class Practice3 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= minprice) {
                minprice = prices[i];
            } else {
                maxprice = (prices[i] - minprice) > maxprice ? (prices[i] - minprice) : maxprice;
            }
        }
        return maxprice;
    }
}
