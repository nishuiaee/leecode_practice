package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 回溯 22.括号生成
 * @author: Yuner
 * @create: 2020-10-04 21:12
 **/
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, n, n, "");
        return res;
    }

    private void dfs(List<String> res, int left, int right, String curStr) {
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }

        if (left < 0)
            return;
        if (right < left)
            return;
        dfs(res, left - 1, right, curStr + "(");
        dfs(res, left, right - 1, curStr + ")");
    }
}
