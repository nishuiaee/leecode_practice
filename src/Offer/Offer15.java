package Offer;

/**
 * @description: 15.二进制统计1的个数
 * @author: Yuner
 * @create: 2020-10-11 09:21
 **/
public class Offer15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0 ) {
            res++;
            n &= n - 1;
        }
        return res++;
    }
}
