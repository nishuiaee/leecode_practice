package Contest_ByteDance.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 18.四数之和
 * @author: Yuner
 * @create: 2020-10-28 15:39
 **/
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] > target) break;
            for (int j = i + 1; j < nums.length - 2; j++) {
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum > target) {
                        while (l < r && nums[r] == nums[--r]);
                    } else if (sum < target) {
                        while (l < r && nums[l] == nums[++l]);
                    } else {
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while (l < r && nums[r] == nums[--r]);
                        while (l < r && nums[l] == nums[++l]);
                    }
                }
            }
        }
        return res;
    }
}
