package Contest.Contest12_1;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-01 20:46
 **/
public class Solution405 {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        char[] hex = "0123456789abcdef".toCharArray();
        while (num != 0) {
            int temp = num & 0xf;
            ans.append(hex[temp]);
            num = (num >> 4);
        }
        return ans.reverse().toString();
    }
}
