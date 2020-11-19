package Contest.Contest11_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-19 20:58
 **/
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(res, path, n, k, visited);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path,int n, int k, boolean[] visited) {
        if (path.size() == k) {
            res.add(path);
        }
        for (int i = 1; i <= n; i++) {
            if(visited[i]) continue;
            path.add(i);
            visited[i] = true;
            backtrack(res, path, n, k, visited);
            visited[i] = false;
            path.remove(i);
        }
    }
}
