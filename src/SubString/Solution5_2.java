package SubString;

import java.util.Arrays;

/**
 * @description: 最长回文子串，动态规划
 * @author: Yuner
 * @create: 2020-11-15 15:52
 **/
public class Solution5_2 {
    public String longestPalindrome(String s) {
        int len = s.length();

        boolean[][] dp = new boolean[len][len];


        char[] charArray = s.toCharArray();
        int maxLen = 1;
        int start = 0;

        for (int j = 1; j < len; j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (charArray[i] == charArray[j]) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }

                if (dp[i][j]) {
                    int curLen = j - i + 1;
                    if (curLen > maxLen) {
                        maxLen = curLen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }


}
