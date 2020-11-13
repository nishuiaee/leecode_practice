package Contest.Contest11_12;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 15:53
 **/
public class Offer12 {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,word, i, j, 0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,String word, int i, int j, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k))
            return false;
        if (k == word.length() - 1)
            return true;
        board[i][j] = '/';
        boolean res = dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word.charAt(k);
        return res;
    }
}
