package Review.day10_24;

import java.util.Random;

/**
 * @description: 按权重随机选择
 * @author: Yuner
 * @create: 2020-10-24 10:56
 **/
public class Solution528 {

    int[] nums;
    int tot;
    Random random = new Random();
    public Solution528(int[] w) {
        nums = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            tot += w[i];
            nums[i] = tot;
        }
    }

    public int pickIndex() {
        int l = 0, r = nums.length - 1;
        int val = random.nextInt(tot) + 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] > val) {
                r = mid - 1;
            } else if (nums[mid] < val) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}
