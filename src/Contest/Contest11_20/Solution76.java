package Contest.Contest11_20;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-20 15:15
 **/
public class Solution76 {
    public String minWindow(String s, String t) {
        int[] chars = new int[128];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            chars[c]++;
        }
        int left = 0;
        int right = 0;
        int ans_left = 0;
        int ans_right = -1;
        int ans_len = 0;
        int count = t.length();
        while (right < s.length()) {
            char c = s.charAt(right);
            chars[c]--;
            if (chars[c] >= 0) {
                count--;
            }
            while (count == 0) {
                int temp = right - left + 1;
                if (temp < ans_len) {
                    ans_len = temp;
                    ans_left = left;
                    ans_right = right;
                }

                char key = s.charAt(left);
                chars[key]++;
                if (chars[key] > 0) {
                    count++;
                }
                left++;
            }
            right++;
        }
        return s.substring(left, right + 1);
    }
}
