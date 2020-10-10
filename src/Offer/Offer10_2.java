package Offer;

/**
 * @description: 10_2青蛙跳台阶
 * @author: Yuner
 * @create: 2020-10-10 14:27
 **/
public class Offer10_2 {
    public int numWays(int n) {
        if(n == 1 || n == 0) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
