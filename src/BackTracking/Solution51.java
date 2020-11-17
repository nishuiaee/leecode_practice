package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: N皇后
 * @author: Yuner
 * @create: 2020-11-17 10:20
 **/
public class Solution51 {
    List<List<String>> res = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(chess[i],'.');
        }
        backtrack(chess, 0);
        return res;
    }

    private void backtrack (char[][] chess, int row) {
        if (row == chess.length) {
            res.add(construct(chess));
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (!isValid(chess, row, col))
                continue;
            chess[row][col] = 'Q';
            backtrack(chess, row + 1);
            chess[row][col] = '.';
        }
    }

    private boolean isValid(char[][] chess, int row, int col) {
        //判断当前列有没有皇后
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }

        //判断当前坐标的右上有没有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        //判断当前坐标的左上有没有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0;i--, j--) {
            if (chess[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private List<String> construct(char[][] chess) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < chess.length; i++) {
            path.add(new String(chess[i]));
        }
        return path;
    }


}
