package SubString;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-27 21:04
 **/
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        return longprefix(strs, 0, strs.length - 1);

    }
    private String longprefix(String[] strs, int left, int right) {
        if (left == right) {
            return strs[left];
        }
        else {
            int mid = left + (right - left) / 2;
            String leftstr = longprefix(strs, left, mid);
            String rightstr = longprefix(strs, left, right);
            return findcommon(leftstr,rightstr);
        }
    }

    private String findcommon(String a, String b) {
        int n = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                n++;
            } else {
                break;
            }
        }
        return a.substring(0, n);
    }
}
