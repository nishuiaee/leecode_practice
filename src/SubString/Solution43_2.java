package SubString;

/**
 * @description: 43.做乘法
 * @author: Yuner
 * @create: 2020-11-17 21:27
 **/
public class Solution43_2 {
    public String multiply(String num1, String num2) {
       if (num1.equals("0") || num2.equals("0"))
           return "0";
       int m = num1.length(), n = num2.length();
       int[] res = new int[m + n + 1];
       for (int i = m - 1; i >= 0; i--) {
           int x = num1.charAt(i) - '0';
           for (int j = n - 1; j >= 0; j--) {
               int y = num2.charAt(j) - '0';
               res[i + j + 1] += x * y;
           }
       }
       for (int i = m + n ; i > 0; i--) {
           res[i - 1] += res[i] / 10;
           res[i] = res[i] % 10;
       }
       int index = res[0] == 0 ? 1 : 0;
       StringBuffer ans = new StringBuffer();
       while (index < m + n) {
           ans.append(res[index]);
           index++;
       }
       return ans.toString();
    }
}

