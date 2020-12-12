package Contest.Contest12_1;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-01 21:34
 **/
public class Solution680 {
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                boolean flag1 = true, flag2 = true;
                for (int i = low + 1, j =  high; i < j;i++,j--) {
                    if (s.charAt(i) != s.charAt(j)) {
                        flag1 = false;
                        break;
                    }
                }
                for (int i = low, j = high - 1; i < j; i++, j--) {
                    if (s.charAt(i) != s.charAt(j)) {
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }



}
