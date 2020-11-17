package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 47.全排列2
 * @author: Yuner
 * @create: 2020-11-16 20:47
 **/
public class Solution47 {

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, path, visited);
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> path, boolean[] visited) {
        if (path.size() == nums.length) {
            res.add(path);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i - 1] == nums[i] && visited[i - 1])) {
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            dfs(nums, path, visited);
            visited[i] = false;
            path.remove();
        }
    }

}
