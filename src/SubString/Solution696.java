package SubString;

import java.util.ArrayList;
import java.util.List;

//696.计数二进制子串
public class Solution696 {
    public int countBinarySubstrings(String s) {

        List<Integer> counts = new ArrayList<>();
        char pre = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == pre)
                count++;
            else {
                counts.add(count);
                count = 1;
            }
            pre = s.charAt(i);
        }
        counts.add(count);
        int res = 0;
        for(int i = 1; i < counts.size(); i++) {
            res += Math.min(counts.get(i-1),counts.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        new Solution696().countBinarySubstrings("00110");
    }
}
