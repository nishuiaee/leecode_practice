package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 15:04
 **/
public class Offer64 {
    public int sumNums(int n) {
       boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
       return n;
    }
}
