package SubString;

/**
 * @description: 回文子串
 * @author: Yuner
 * @create: 2020-11-16 16:03
 **/
public class Solution647 {
    public int countSubstrings(String s) {
        int len = s.length();

        boolean[][] dp = new boolean[len][len];
        int ans = 0;
        char[] chars = s.toCharArray();
        for (int j = 1; j < len; j++) {
            for (int i = j - 1; i >= 0; i++) {
                if (chars[i] == chars[j]) {
                    if (j - i < 3)
                        dp[i][j] = true;
                    else
                        dp[i][j] = dp[i + 1][j - 1];
                } else
                    dp[i][j] = false;
                if (dp[i][j])
                    ans++;
            }
        }
        return ans + len;
    }
}
