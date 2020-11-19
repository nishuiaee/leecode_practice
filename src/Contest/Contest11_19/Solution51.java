package Contest.Contest11_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-19 20:33
 **/
public class Solution51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] chars = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(chars[i],'.');
        }
        backtrack(res, chars, 0);
        return res;
    }

    private void backtrack(List<List<String>> res, char[][] chars, int rows) {
        if (rows == chars.length) {
            res.add(construct(chars));
        }
        for (int i = 0; i < chars.length; i++) {
            if (!isValidate(chars, i, rows)) {
                continue;
            }
            chars[rows][i] = 'Q';
            backtrack(res, chars, rows + 1);
            chars[rows][i] = '.';
        }
    }

    private boolean isValidate(char[][] chars, int cols, int rows) {
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (chars[i][cols] == 'Q') {
                return false;
            }
        }
        for (int i = rows - 1, j = cols + 1; i >= 0 && j < len; i--, j++) {
            if (chars[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = rows - 1, j = cols - 1; i >= 0 && j < len; i--, j--) {
            if (chars[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> construct(char[][] chars) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            res.add(new String(chars[i]));
        }
        return res;
    }
}
