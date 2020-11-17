package Contest.Contest11_17;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-17 16:00
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }
            map.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
