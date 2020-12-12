package Contest.Contest12_3;

import java.util.*;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-03 12:26
 **/
public class Offer50 {
    public char firstUniqChar(String s) {
       if (s.length() == 0) return ' ';
       Map<Character, Boolean> map = new LinkedHashMap<>();
       for (int i = 0; i < s.length(); i++) {
           map.put(s.charAt(i),!map.containsKey(s.charAt(i)));
       }
       for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
           if (entry.getValue() == true) {
               return entry.getKey();
           }
       }
       return ' ';
    }
}
