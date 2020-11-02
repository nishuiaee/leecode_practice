package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-01 14:52
 **/
public class Offer14_1 {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if (b == 0) return (int) Math.pow(3, a);
        if (b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }
    public int cuttingRope_dp(int n) {
        int[] dp = new int[n + 1];
        if (n <= 3) return n - 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i < n; i++) {
            for (int j = 1; j < i / 2; j++) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }
}
