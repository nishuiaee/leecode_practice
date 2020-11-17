package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 组合总和1
 * @author: Yuner
 * @create: 2020-11-17 10:54
 **/
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, res,0, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> res, int i, List<Integer> path) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int start = i; start < candidates.length; start++) {
            if (target < candidates[start]) break;
            path.add(candidates[start]);
            backtrack(candidates, target - candidates[start], res, start, path);
            path.remove(path.size() - 1);
        }
    }
}
