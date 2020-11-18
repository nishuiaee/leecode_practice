package Contest.Contest11_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-18 21:53
 **/
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] vistited = new boolean[nums.length];
        dfs(res, path, vistited, nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, boolean[] visited, int[] nums) {
        if (path.size() == nums.length) {
            res.add(path);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            dfs(res, path, visited, nums);
            visited[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
