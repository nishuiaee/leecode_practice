package Contest_ByteDance.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 三数之和
 * @author: Yuner
 * @create: 2020-10-28 14:36
 **/
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[++l]);
                    while (l < r && nums[r] == nums[--r]);
                } else if (sum > 0) {
                    while (l < r && nums[r] == nums[--r]);
                } else {
                    while (l < r && nums[l] == nums[++l]);
                }
            }
        }
        return res;
    }
}
