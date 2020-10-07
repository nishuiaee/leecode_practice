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
        List<String> list = new ArrayList<>();
        backtrack(list,new StringBuilder(),0,0,n);
        return list;
    }
    private void backtrack (List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append('(');
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(ans,cur,open,close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
