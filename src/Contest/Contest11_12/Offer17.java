package Contest.Contest11_12;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 16:44
 **/
public class Offer17 {
    public int[] printNumbers(int n) {
        int a = (int)Math.pow(10, n);
        int[] res = new int[a + 1];
        for (int i = 0; i < a - 1; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
