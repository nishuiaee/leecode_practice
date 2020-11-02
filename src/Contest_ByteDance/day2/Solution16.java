package Contest_ByteDance.day2;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-28 15:21
 **/
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(res - target) > Math.abs(sum - target))
                    res = sum;
                if (sum < target) {
                    while (l < r && nums[l] == nums[++l]);
                } else if (sum > target) {
                    while (l < r && nums[r] == nums[--r]);
                } else {
                    return res;
                }
            }
        }
        return res;
    }
}
