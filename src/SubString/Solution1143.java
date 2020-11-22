package SubString;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-20 11:32
 **/
public class Solution1143 {
    //暴力
    public int longestCommonSubsequence(String text1, String text2) {
        int maxLen = 0;
        for (int i = 0; i < text1.length(); i++) {
            int ii = i;
            int len = 0;
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(ii) == text2.charAt(j)) {
                    len++;
                    ii++;
                    maxLen = Math.max(maxLen, len);
                } else {
                    len = 0;
                    ii = i;
                }
            }
        }
        return maxLen;
    }
}
