package other;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-24 09:15
 **/
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder str, int open, int close, int n) {
        if (str.length() == n * 2) {
            res.add(str.toString());
            return;
        }
        if (open < n) {
            str.append('(');
            backtrack(res, str, open + 1, close, n);
            str.deleteCharAt(str.length() - 1);
        }
        if (close < open) {
            str.append(')');
            backtrack(res, str, open, close + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
