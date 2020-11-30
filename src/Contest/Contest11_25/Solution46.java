package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 46.全排列
 * @author: Yuner
 * @create: 2020-11-25 15:42
 **/
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(res, path, new boolean[nums.length], nums);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> path, boolean[] validate, int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return ;
        }
        for (int i = 0; i < nums.length; i++) {
            if (validate[i]) {
                continue;
            }
            validate[i] = true;
            path.add(nums[i]);
            backtrack(res, path, validate, nums);
            validate[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
