package Offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 17:02
 **/
public class Offer50 {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c: sc)
            dic.put(c, !dic.containsKey(c));
        for (char c : sc)
            if (dic.get(c)) return c;
            return ' ';
    }
    public char solution2 (String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc)
            dic.put(c, !dic.containsKey(c));
        for (Map.Entry<Character, Boolean> d : dic.entrySet()) {
            if (d.getValue()) return d.getKey();
        }
        return  ' ';
    }
}
