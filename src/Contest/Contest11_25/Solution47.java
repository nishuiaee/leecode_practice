package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-25 16:13
 **/
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, path, new boolean[nums.length], nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, boolean[] validate, int[] nums) {
        if (path.size() == nums.length) {
            res.add(path);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (validate[i] || (i > 0 && nums[i] == nums[i - 1] && validate[i])) {
                continue;
            }
            validate[i] = true;
            path.add(nums[i]);
            backtrack(res, path, validate, nums);
            validate[i] = false;
            path.remove(nums[i]);
        }

    }
}
