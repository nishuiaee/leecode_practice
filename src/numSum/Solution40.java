package numSum;

import java.util.*;

/**
 * @description: 40.数组总和二
 * @author: Yuner
 * @create: 2020-09-09 08:48
 **/
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();

        if(len == 0) return res;

        Arrays.sort(candidates);

        Deque<Integer> path = new ArrayDeque<>();

        dfs(candidates, 0, len, target, res, path);

        return res;
    }

    private void dfs(int[] candidates, int begin, int len, int target, List<List<Integer>> res, Deque<Integer> path) {
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = begin; i < len; i++) {
            if(target - candidates[i] < 0) {
                break;
            }

            if(i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.addLast(candidates[i]);
            dfs(candidates, i+1, len, target - candidates[i], res, path);
            path.removeLast();
        }
    }
}
