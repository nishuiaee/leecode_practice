package numSum.BinarySearch;

/**
 * @description: 50.pow(x,n)
 * @author: Yuner
 * @create: 2020-11-24 21:40
 **/
public class Solution50 {

    public double myPow(double x, int n) {
        long b = n;
        double res = 1.0;
        if (n < 0) {
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
