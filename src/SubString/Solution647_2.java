package SubString;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-16 16:13
 **/
public class Solution647_2 {
    int ans = 0;
    public int countSubstrings(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            validate(s,i,i);
            validate(s,i,i + 1);
        }
        return ans;
    }
    private void validate(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                ans++;
                left--;
                right++;
            } else {
                break;
            }
        }
    }
}
