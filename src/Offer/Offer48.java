package Offer;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 16:19
 **/
public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
       int max = 0, left = 0;
       HashMap<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if (map.containsKey(c)) {
               left = Math.max(left, map.get(c) + 1);
           }
           map.put(c, i);
           max = Math.max(max, i - left + 1);
       }
       return max;
    }
}
