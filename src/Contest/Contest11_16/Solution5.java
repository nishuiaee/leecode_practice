package Contest.Contest11_16;

/**
 * @description:暴力
 * @author: Yuner
 * @create: 2020-11-16 15:14
 **/
public class Solution5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int maxLen = 1;
        int begin = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validate(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    private boolean validate(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
