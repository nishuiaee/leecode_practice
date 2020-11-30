package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-25 16:56
 **/
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, path, candidates, target, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, int[] candidates, int target, int start) {
        if (target < 0) return;
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return ;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            backtrack(res, path, candidates, target - candidates[i], i + 1);
            path.remove(path.size() - 1);
        }
    }

}
