package Contest.Contest11_12;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 15:06
 **/
public class Offer10 {
    public int fib(int n) {
        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 0 , b = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (a + b) % 1000000007;
            a = b;
            b = res;
        }
        return res;
    }
}
