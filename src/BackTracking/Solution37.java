package BackTracking;

/**
 * @description: 37.解数独
 * @author: Yuner
 * @create: 2020-11-17 15:20
 **/
public class Solution37 {
    public boolean solveSudoku(char[][] board) {
        return backtrack(board, 0, 0);
    }

    private boolean backtrack(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        if (col == board.length)
            return backtrack(board, row + 1, 0);
        if (board[row][col] != '.')
            return backtrack(board, row, col + 1);
        for (char i = '1'; i <= '9'; i++) {
            if (!isValid(board, row, col, i))
                continue;
            board[row][col] = i;
            if(backtrack(board, row, col))
                return true;
            board[row][col] = '.';
        }
        return false;
    }
    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c)
                return false;
            if (board[row][i] == c)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }

}
