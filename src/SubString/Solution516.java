package SubString;

/**
 * @description: 最长回文子序列
 * @author: Yuner
 * @create: 2020-11-16 15:44
 **/
public class Solution516 {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        char[] chars = s.toCharArray();

        for (int j = 1; j < len; j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (chars[i] == chars[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        return dp[0][len - 1];
    }
}
