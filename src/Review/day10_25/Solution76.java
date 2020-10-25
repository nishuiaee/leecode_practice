package Review.day10_25;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 12:09
 **/
public class Solution76 {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int[] winFeq = new int[128];
        int[] tFeq = new int[128];

        for (int c: tCharArray) {
            tFeq[c]++;
        }

        int distance = 0;
        int minLen = sLen + 1;
        int begin = 0;
        int l = 0, r = 0;

        while (r < sLen) {
            char rchar = sCharArray[r];
            if (tFeq[rchar] == 0) {
                r++;
                continue;
            }

            if (winFeq[rchar] < tFeq[rchar]) {
                distance++;
            }
            winFeq[rchar]++;
            r++;
            while (distance == tLen) {
                char lchar = sCharArray[l];
                if (r - l < minLen) {
                    minLen = r - l;
                    begin = l;
                }
                if (tFeq[lchar] == 0) {
                    l++;
                    continue;
                }
                if (winFeq[lchar] == tFeq[lchar]) {
                    distance--;
                }
                winFeq[lchar]--;
                l++;
            }
        }
        if (minLen == sLen + 1) {
            return "";
        }
        return s.substring(begin, begin + minLen);
    }
}
