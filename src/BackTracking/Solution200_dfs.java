package BackTracking;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-17 15:01
 **/
public class Solution200_dfs {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] gird, int i, int j) {
        if (i < 0 || i >= gird.length || j < 0 || j >= gird[0].length || gird[i][j] == '0') {
            return;
        }
        gird[i][j] = '0';
        dfs(gird, i + 1, j);
        dfs(gird, i - 1, j);
        dfs(gird, i, j + 1);
        dfs(gird, i, j - 1);
    }
}
