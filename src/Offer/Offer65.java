package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 15:09
 **/
public class Offer65 {
    public int add(int a, int b) {
        while (b != 0) {
            int n = (a & b) << 1;
            a = a ^ b;
            b = n;
        }
        return a;
    }
}
