package SubString;

/**
 * @description: 8.字符串转换整数
 * @author: Yuner
 * @create: 2020-11-18 17:19
 **/
public class Solution8 {

    public int myAtoi(String str) {
        int idx = 0;
        char[] chars = str.toCharArray();
        boolean flag = false;
        int res = 0;
        while (idx < str.length() && chars[idx] == ' ') {
            idx++;
        }
        if(idx == str.length()) {
            return 0;
        }

        if (chars[idx] == '-') {
            flag = true;
            idx++;
        } else if (chars[idx] == '+'){
            idx++;
        } else if (!Character.isDigit(chars[idx])) {
            return 0;
        }

        while (idx < str.length() && Character.isDigit(chars[idx])) {
            int x = chars[idx] - '0';
            if (res > (Integer.MAX_VALUE - x) / 10) {
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + x;
            idx++;
        }
        return flag ? -res : res;
    }
    
}
