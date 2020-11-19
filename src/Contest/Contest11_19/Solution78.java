package Contest.Contest11_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-19 21:23
 **/
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        res.add(new ArrayList<>(path));
        backtrack(res, path, 0, nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, int start, int[] nums) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(i);
            backtrack(res, path, 1, nums);
            path.remove(path.size() - 1);
        }
    }
}
