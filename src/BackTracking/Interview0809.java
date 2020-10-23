package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 括号
 * @author: Yuner
 * @create: 2020-10-23 19:30
 **/
public class Interview0809 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        backtracking(res, sb, 0, 0 , n);
        return res;
    }
    private void backtracking (List<String> res, StringBuffer sb, int begin, int end, int max) {

        if (sb.length() == max * 2) {
            res.add(sb.toString());
            return ;
        }
        if (begin < max) {
            sb.append("(");
            backtracking(res, sb, begin + 1, end, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (end < begin) {
            sb.append(")");
            backtracking(res, sb, begin, end + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
