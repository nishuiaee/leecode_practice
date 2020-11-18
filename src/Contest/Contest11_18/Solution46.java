package Contest.Contest11_18;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 46.全排列
 * @author: Yuner
 * @create: 2020-11-18 21:30
 **/
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(res, path, nums, visited);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, int[] nums, boolean[] vistited) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vistited[i] == true)
                continue;
            path.add(nums[i]);
            vistited[i] = true;
            dfs(res, path, nums, vistited);
            vistited[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
