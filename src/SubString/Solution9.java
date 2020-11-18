package SubString;

/**
 * @description: 9.回文数
 * @author: Yuner
 * @create: 2020-11-18 21:03
 **/
public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x == 0 || (x < 10 && x > 0)) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }
}
