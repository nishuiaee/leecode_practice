package Contest.Contest11_12;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 16:32
 **/
public class Offer14_1 {
    public int cuttingRope(int n) {
        int a = n / 3;
        int b = n % 3;
        if (b == 0) return (int)Math.pow(3, a);
        if (b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3,a) * 2;
    }
}
