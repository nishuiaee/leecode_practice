package numSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: 528.按权重随机选择
 * @author: Yuner
 * @create: 2020-10-23 15:42
 **/
public class Solution528 {

    List<Integer> list = new ArrayList<>();
    int tot = 0;
    Random random = new Random();

    public Solution528(int[] w) {

        for (int x : w) {
            tot += x;
            list.add(tot);
        }
    }

    public int pickIndex() {
        int targ = random.nextInt(tot) + 1;

        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);

            if (targ > list.get(mid)) {
                l = mid + 1;
            } else if (targ < list.get(mid)) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}
