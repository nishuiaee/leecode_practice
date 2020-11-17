package SubString;

/**
 * @description: 验证回文串
 * @author: Yuner
 * @create: 2020-11-16 16:19
 **/
public class Solution125 {
    public boolean isPalindrome(String s) {
       StringBuffer str = new StringBuffer();

       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if (Character.isLetterOrDigit(c)) {
               str.append(Character.toLowerCase(c));
           }
       }
       StringBuffer str2 = new StringBuffer(str).reverse();
       return str2.toString().equals(str.toString());
    }

    //双指针
    public boolean solution2(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }
}
