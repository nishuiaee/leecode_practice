package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-25 15:15
 **/
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(res, path, nums, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> path, int[] nums, int start) {
        res.add(path);
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(res, path, nums, i);
            path.remove(path.size() - 1);
        }
    }
}
