package Offer;

/**
 * @description: 14-1剪绳子
 * @author: Yuner
 * @create: 2020-10-11 09:12
 **/
public class Offer14 {
    public int cuttingRope(int n) {
        int res = 0;
        while (n != 0 ) {
            res++;
            n &= n - 1;
        }
        return res++;
    }
}
