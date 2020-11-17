package BackTracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:46.全排列
 * @author: Yuner
 * @create: 2020-11-16 19:39
 **/
public class Solution46 {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track, visited);
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> track, boolean[] visited) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            track.add(nums[i]);
            visited[i] = true;
            backtrack(nums, track, visited);
            visited[i] = false;
            track.removeLast();
        }
    }
}
