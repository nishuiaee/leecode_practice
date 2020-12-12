package Contest.Contest12_1;

/**
 * @description: 三进制转十进制
 * 十进制转换成任意进制
 * @author: Yuner
 * @create: 2020-10-25 09:57
 **/
public class Solution1 {
    public int toDecimal(String a) {
        boolean flag = true;
        int n = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '-') {
                flag = false;
            } else {
                n = n * 3 + (c - '0');
            }
        }
        return n;
    }

    //把m转换成n进制
    public String getResult(int m, int n) {
        char[] c = {'A','B','C','D','E','F'};
        StringBuilder sb = new StringBuilder();
        while (m > 0) {
            int k = m % n;
            if (k > 9) {
                sb.append(c[k - 10]);
            } else {
                sb.append(k);
            }
            m /= n;
        }
        return sb.reverse().toString();
    }

    //把m转换成n进制
    public String getResult1(int m, int n) {
        char[] c = {'A','B','C','D','E','F'};
        StringBuilder sb = new StringBuilder();
        while (m > 0) {
           int k = m % n;
           if (k > 9) {
               sb.append(c[k - 10]);
           } else {
               sb.append(k);
           }
           m /= n;
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int a = -12012210;
        //System.out.println(solution1.toDecimal(Integer.toString(a)));
        int b =  10;
        System.out.println(solution1.getResult(b,2));
    }
}
