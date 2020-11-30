package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-25 16:25
 **/
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(res, path, candidates, target);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, int[] candidates, int target) {
        if (target == 0) {
            res.add(path);
        }
        for (int i = 0; i < candidates[i]; i++) {
            path.add(candidates[i]);
            backtrack(res, path, candidates, target - candidates[i]);
            path.remove(path.size() - 1);
        }
    }


}
