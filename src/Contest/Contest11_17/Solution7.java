package Contest.Contest11_17;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-17 22:31
 **/
public class Solution7 {
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = -x;
        }
        long y = 0;
        int count = 1;
        while (x != 0) {
            y += (x % 10) * count;
            count *= 10;
            x = x / 10;
        }
        if (y > Integer.MAX_VALUE) {
            return 0;
        }
        else {
            if (flag) {
                return (int)y;
            } else {
                return (int)-y;
            }

        }
    }
}
