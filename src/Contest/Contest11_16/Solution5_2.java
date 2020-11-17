package Contest.Contest11_16;

/**
 * @description: 中心扩展
 * @author: Yuner
 * @create: 2020-11-16 15:22
 **/
public class Solution5_2 {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";

        for (int i = 0; i < len; i++) {
            String oddStr = validate(s, i, i);
            String evenStr = validate(s, i, i + 1);
            String maxStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if (maxStr.length() > res.length()) {
                res =  maxStr;
            }
        }
        return res;
    }

    private String validate(String s, int left, int right) {
        int len = s.length();
        while (left >= 0 && right < len) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else
                break;
        }
        return s.substring(left + 1, right);
    }
}
