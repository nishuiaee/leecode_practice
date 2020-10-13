package Offer;

/**
 * @description: 19.正则表达式匹配
 * @author: Yuner
 * @create: 2020-10-13 15:16
 **/
public class Offer19 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) return false;
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = false;
        for (int i = 1; i <= n; i++) {
            if(p.charAt(0) == '*') {
                dp[0][1] = false;
                continue;
            }
            if (p.charAt(i - 1) == '*') dp[0][i] = dp[0][i - 2];
        }
        for (int si = 1; si <= m; si++) {
            for (int pi = 1; pi <= n; pi++) {
                if (p.charAt(pi - 1) == s.charAt(si - 1) || p.charAt(pi - 1) == '.')
                    dp[si][pi] = dp[si-1][pi-1];

                else if (p.charAt(0) == '*') continue;

                else if (p.charAt(pi - 1) == '*') {
                    if (p.charAt(pi - 2) == s.charAt(si - 1) || p.charAt(pi - 2) == '.') {
                        dp[si][pi] = dp[si][pi - 2] || dp[si - 1][pi];
                    } else {
                        dp[si][pi] = dp[si][pi - 2];
                    }
                }
            }
        }
        return dp[m][n];
    }
}
