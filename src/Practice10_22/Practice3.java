package Practice10_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 三数之和
 * @author: Yuner
 * @create: 2020-10-22 19:05
 **/
public class Practice3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] > 0) return res;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    while (l < r && nums[r] == nums[--r]);
                } else if (sum < 0) {
                    while (l < r && nums[l] == nums[++l]);
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    while (l < r && nums[l] == nums[++l]);
                    while (l < r && nums[r] == nums[--r]);
                }
            }
        }
        return res;
    }
}
