package Contest.Contest11_12;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 15:14
 **/
public class Offer10_2 {
    public int numWays(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int a = 1, b = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = (a + b) % 1000000007;
            a = b;
            b = res;
        }
        return res;
    }
}
