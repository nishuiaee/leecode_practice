package Contest.Contest12_06;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-06 10:59
 **/
public class Solution3 {
    public int concatenatedBinary(int n) {
        if (n == 0) {
            return 0;
        }
        StringBuffer res = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            res.append(getResult(i));
        }
        return toDecimal(res.toString());
    }

    public StringBuffer getResult(int m) {
        StringBuffer sb = new StringBuffer();
        while (m > 0) {
            int k = m % 2;
            sb.append(k);
            m /= 2;
        }
        return sb.reverse();
    }

    public int toDecimal(String a) {
        boolean flag = true;
        int n = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            n = (n * 2 + (c - '0')) % ((int)Math.pow(10,9) + 7);
        }
        return n;
    }
}
