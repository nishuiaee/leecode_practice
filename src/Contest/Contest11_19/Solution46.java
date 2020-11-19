package Contest.Contest11_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-19 19:52
 **/
public class Solution46 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(res, path, visited, nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, boolean[] visited, int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && visited[i]))
                continue;
            path.add(nums[i]);
            visited[i] = true;
            backtrack(res, path, visited, nums);
            visited[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
