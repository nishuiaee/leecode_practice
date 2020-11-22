package SubString.SlideWindow;

import javax.swing.*;

/**
 * @description: 最小覆盖子串
 * @author: Yuner
 * @create: 2020-11-20 14:32
 **/
public class Solution76 {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (int i = 0; i < t.length(); i++) {
            char char_i = t.charAt(i);
            map[char_i]++;
        }
        int left = 0;
        int right = 0;
        int ans_left = 0;
        int ans_right = -1;
        int ans_len = Integer.MAX_VALUE;
        int count = t.length();
        while (right < s.length()) {
            char char_right = s.charAt(right);
            map[char_right]--;

            if (map[char_right] >= 0) {
                count--;
            }
            while (count == 0) {
                int temp_len = right - left + 1;
                if (temp_len < ans_len) {
                    ans_left = left;
                    ans_right = right;
                    ans_len = temp_len;
                }

                char key = s.charAt(left);
                map[key]++;
                if (map[key] > 0) {
                    count++;
                }
                left++;
            }
            right++;
        }
        return s.substring(ans_left, ans_right + 1);
    }
}
