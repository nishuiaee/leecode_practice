package Offer;

/**
 * @description: 10.斐波那契数列
 * @author: Yuner
 * @create: 2020-10-10 14:10
 **/
public class Offer10_1 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    public int fib2 (int n) {
        int a = 0,b = 1;
        int sum;
        for (int i = 0; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
