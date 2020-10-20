package Review.day10_20;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-20 14:34
 **/
public class Solution200_dfs {

    private void dfs(int i, int j, char[][] grid) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return ;

        grid[i][j] = '0';
        dfs(i + 1, j ,grid);
        dfs(i - 1, j, grid);
        dfs( i, j + 1, grid);
        dfs(i, j - 1, grid);

    }

    public int numsIsland(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new Solution200_dfs().numsIsland(new char[][]{{'1','1','1',1,0,0},{1,1,1,1,0,0},{1,1,1,1,0,0}});
        System.out.println(i);
    }
}
