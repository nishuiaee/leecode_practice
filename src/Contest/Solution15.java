package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 三数之和
 * @author: Yuner
 * @create: 2020-10-24 09:32
 **/
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = len - 1;

            while (l < r) {
                sum = nums[l] + nums[r] + nums[i];
                if (sum > 0) {
                    while (l < r && nums[r] == nums[--r]);
                } else if (sum < 0) {
                    while (l < r && nums[l] == nums[++l]);
                } else {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[r] == nums[--r]);
                    while (l < r && nums[l] == nums[++l]);
                }
            }

        }

        return res;
    }
}
