package Practice10_14;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: bfs dfs
 * @author: Yuner
 * @create: 2020-10-19 09:42
 **/
public class Practice8 {

    private void dfs(char[][] grid, int r, int c) {

        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0')
            return;

        grid[r][c] = '0';

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands (char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1')
                {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public int numIslands_bfs(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int columns = grid[0].length;

        int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
        boolean[][] marked = new boolean[rows][columns];
        int count = 0;

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (!marked[i][j] & grid[i][j] == '1') {
                    count++;
                    deque.push(i * columns + j);
                    marked[i][j] = true;
                    while (!deque.isEmpty()) {
                        int cur = deque.pop();
                        int curX = cur / columns;
                        int curY = cur % columns;
                        for (int k = 0; k < 4; k++) {
                            int newX = curX + direction[k][0];
                            int newY = curY + direction[k][1];
                            if (newX >= 0 && newX < rows && newY >= 0 && newY < columns && grid[newX][newY] == '1' && !marked[newX][newY]){
                                deque.addLast(newX * columns + newY);
                                marked[newX][newY] = true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
