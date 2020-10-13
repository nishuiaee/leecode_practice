package Offer;

/**
 * @description: 打印从1到最大的n位数
 * @author: Yuner
 * @create: 2020-10-12 11:54
 **/
public class Offer17 {
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }
}
