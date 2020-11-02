package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 16:28
 **/
public class Offer49 {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n4 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2,n3),n4);
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n4)c++;
        }
        return dp[n - 1];
    }
}
