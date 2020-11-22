package SubString.SlideWindow;

import java.util.HashMap;

/**
 * @description:最长无重复字符子串
 * @author: Yuner
 * @create: 2020-11-20 14:23
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
