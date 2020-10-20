package Practice10_14;

/**
 * @description: 74.最小覆盖子串
 * @author: Yuner
 * @create: 2020-10-19 13:43
 **/
public class Solution10 {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen == 0 || tLen == 0 || sLen < tLen) {
            return "";
        }
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        int[] winFeq = new int[128];
        int[] tFeq = new int[128];

        for (char c : t.toCharArray()) {
            tFeq[c] += 1;
        }

        int distance = 0; //窗口内出现多少次T中的字符
        int minLen = sLen + 1;
        int begin = 0;

        int l = 0, r = 0;

        while (r < sLen) {
            if (tFeq[charArrayS[r]] == 0) {
                r++;
                continue;
            }
            if (winFeq[charArrayS[r]] < tFeq[charArrayS[r]]) {
                distance++;
            }
            winFeq[charArrayS[r]]++;
            r++;
            while (distance == tLen) {

                if (r - l < minLen) {
                    minLen = r - l;
                    begin = l;
                }
                if (tFeq[charArrayS[l]] == 0) {
                    l++;
                    continue;
                }
                if (winFeq[charArrayS[l]] == tFeq[charArrayS[l]]) {
                    distance--;
                }
                winFeq[charArrayS[l]]--;
                l++;
            }
        }

        if (minLen == sLen + 1) {
            return "";
        }
        return s.substring(begin, begin + minLen);

    }
}
