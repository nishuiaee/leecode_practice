package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-25 15:51
 **/
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(res, path, n, k, 1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, int n, int k, int start) {
        if (k == 0) {
            res.add(new ArrayList<>(path));
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(res, path, n, k - 1, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
