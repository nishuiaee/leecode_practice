package Contest.Contest11_17;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-17 20:42
 **/
public class Solution5 {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String res = "";
        for (int i = 0; i < s.length() - 2; i++) {
            String oddstr = validate(s, i, i);
            String evenstr = validate(s, i, i + 1);
            if (oddstr.length() > maxLen) {
                maxLen = oddstr.length();
                res = oddstr;
            }
            if (evenstr.length() > maxLen) {
                maxLen = evenstr.length();
                res = evenstr;
            }
        }
        return res;
    }

    public String validate(String s, int i, int j) {
        while (i >= 0 && j < s.length() - 1) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else
                break;
        }
        return s.substring(i + 1, j);
    }
}
