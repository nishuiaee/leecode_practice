package Contest.Contest11_28;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-28 10:58
 **/
public class Solution14 {


    public String longestCommonPrefix(String[] strs) {
        return longPrefix(strs, 0, strs.length - 1);
    }
    private String longPrefix (String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = l + (r - l) / 2;
            String a = longPrefix(strs, l, mid);
            String b = longPrefix(strs, mid + 1, r);
            return findCommon(strs[l], strs[r]);
        }
    }

    private String findCommon(String a, String b) {
        int i = 0;
        for ( ; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {

            } else {
                break;
            }
        }
        return a.substring(0,i);
    }
}
