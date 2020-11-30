package Contest.Contest11_26;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-27 20:54
 **/
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            str = findcommon(str, strs[i]);
        }
        return str;
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
        return a.substring(0,n + 1);
    }
}
