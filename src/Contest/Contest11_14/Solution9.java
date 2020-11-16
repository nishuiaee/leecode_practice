package Contest.Contest11_14;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-15 14:10
 **/
public class Solution9 {
    //递归
    public boolean isPalindrome(int x) {
       if (x == 0 || x < 10 && x > 0) {
           return true;
       }
       if (x < 0 || x % 10 == 0)
           return false;
       int reversenum = 0;
       while (x > reversenum) {
           reversenum = reversenum * 10 + x % 10;
           x /= 10;
       }
       return x == reversenum || x == reversenum/10;
    }
}
