package numSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: 1
 * @author: Yuner
 * @create: 2020-10-23 16:21
 **/
public class Solution {

    int tot = 0;
    int[] nums;
    Random random = new Random();

    public Solution(int[] w) {
        nums = new int[w.length];
        for (int i = 0; i < w.length; i++ ) {
            tot += w[i];
            nums[i]= tot;
        }

    }

    public int pickIndex() {
        int targ = random.nextInt(tot) + 1;

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);

            if (targ > nums[mid]) {
                l = mid + 1;
            } else if (targ < nums[mid]) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}
