package SubString;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:43.大数相乘
 * @author: Yuner
 * @create: 2020-11-17 20:42
 **/
public class Solution43 {
    public String multiply(String num1, String num2) {
      if (num1.equals("0") || num2.equals("0")) {
          return "0";
      }
      String ans = "0";
      int m = num1.length(), n = num2.length();
      for (int i = n - 1; i >= 0; i--) {
          StringBuffer curr = new StringBuffer();
          int carry = 0;
          for (int j = n - 1; j > i; j--) {
              curr.append(0);
          }
          int y = num2.charAt(i) - '0';
          for (int j = m - 1; j >= 0; j--) {
              int x = num1.charAt(j) - '0';
              int product = x * y + carry;
              curr.append(product % 10);
              carry = product / 10;
          }
          if (carry != 0) {
              curr.append(carry % 10);
          }
          ans = addStrings(ans, curr.reverse().toString());
      }
      return ans;
    }

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
