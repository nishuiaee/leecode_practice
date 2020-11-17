package SubString;

/**
 * @description: 415.字符串相加
 * @author: Yuner
 * @create: 2020-11-17 21:06
 **/
public class Solution415 {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuffer str = new StringBuffer();
        while (i >= 0 || j >= 0) {
            int n1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j) - '0';

            int sum = carry + n1 + n2;
            carry = sum / 10;
            sum = sum % 10;

            str.append(sum);
            i--;
            j--;
        }
        if (carry == 1)
            str.append(carry);
        return str.reverse().toString();
    }
}
