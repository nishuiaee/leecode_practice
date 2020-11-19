package SubString;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-19 20:11
 **/
public class Solution50 {
    public double myPow(double x, int n) {
       if (x == 0.0) {
           return 0.0;
       }
       long b = n;
       double res = 1.0;
       if (b < 0) {
           x = 1 / x;
           b = -b;
       }
       while (b > 0) {
           if ((b & 1) == 1) {
               res *= x;
           }
           x *= x;
           b = b >> 1;
       }
       return res;
    }
}
