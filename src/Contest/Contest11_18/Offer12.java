package Contest.Contest11_18;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-18 21:13
 **/
public class Offer12 {
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                res = dfs(board, word, i, j, 0);
            }
        }
        return res;
    }

    private boolean dfs (char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '.';

        dfs(board, word, i + 1, j, k + 1);
        dfs(board, word, i - 1, j , k + 1);
        dfs(board, word, i, j + 1, k + 1);
        dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp;
        return true;
    }
}
