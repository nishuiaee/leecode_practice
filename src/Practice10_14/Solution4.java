package Practice10_14;

/**
 * @description: 验证回文串
 * @author: Yuner
 * @create: 2020-10-14 17:01
 **/
public class Solution4 {
    public boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        StringBuffer stringBuffer = new StringBuffer(str).reverse();

        return str.toString().equals(stringBuffer.toString());
    }
}
