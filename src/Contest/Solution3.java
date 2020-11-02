package Contest;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-27 20:07
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }
            map.put(c,i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
