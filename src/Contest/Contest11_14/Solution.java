package Contest.Contest11_14;

import java.util.*;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-15 10:52
 **/
public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (map1.containsKey(c))
                map1.put(c,map1.get(c) + 1);
            else
                map1.put(c, 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            if (map2.containsKey(c))
                map2.put(c,map2.get(c) + 1);
            else
                map2.put(c, 1);
        }
        int[] nums1 = new int[map1.size()];

        int[] nums2 = new int[map2.size()];
        if (map1.size() != map2.size())
            return false;
        Iterator<Map.Entry<Character, Integer>> iterator1 = map1.entrySet().iterator();
        for (int i = 0; iterator1.hasNext(); i++) {
            Map.Entry<Character, Integer> entry = iterator1.next();
            if(!map2.containsKey(entry.getKey()))
                return false;
            nums1[i] = entry.getValue();
        }
        Iterator<Map.Entry<Character, Integer>> iterator2 = map2.entrySet().iterator();
        for (int i = 0; iterator2.hasNext(); i++) {
            Map.Entry<Character, Integer> entry = iterator2.next();
            nums2[i] = entry.getValue();
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "cabbba";
        String b = "aabbss";
        new Solution().closeStrings(a, b);
    }
}
