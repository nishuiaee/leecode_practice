package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:组合
 * @author: Yuner
 * @create: 2020-11-17 12:55
 **/
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        backtrack(res, n, k, 1, new ArrayList<>());
        return res;
    }

    private void backtrack(List<List<Integer>> res, int n, int k, int start, List<Integer> path) {
        if (k == 0) {
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            path.add(i);
            backtrack(res, n, k - 1, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
