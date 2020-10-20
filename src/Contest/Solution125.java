package Contest;

/**
 * @description: 125.验证回文串
 * @author: Yuner
 * @create: 2020-10-20 11:03
 **/
public class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                sb.append(Character.toLowerCase(chars[i]));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
