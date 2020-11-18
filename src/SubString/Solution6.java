package SubString;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-18 16:48
 **/
public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int len = s.length();
        List<StringBuilder> lists = new ArrayList<>();
        for (int i = 0; i < Math.min(len, numRows); i++) {
            lists.add(new StringBuilder());
        }
        int curRow = 0;
        boolean flag = false;
        for (char c : s.toCharArray()) {
            lists.get(curRow).append(c);
            if (curRow == numRows - 1 || curRow == 0) {
                flag = !flag;
            }
            curRow += (flag == true ? 1 : -1);
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder str : lists) {
            res.append(str);
        }
        return res.toString();
    }
}
