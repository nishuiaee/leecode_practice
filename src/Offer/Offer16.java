package Offer;

/**
 * @description: 数值的整数次方
 * @author: Yuner
 * @create: 2020-10-11 09:22
 **/
public class Offer16 {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
