package Practice10_14;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 岛屿数量广度优先搜索
 * @author: Yuner
 * @create: 2020-10-14 21:50
 **/
public class Practice8_bfs {

    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        rows = grid.length;
        cols = grid[0].length;
        boolean[][] marked = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!marked[i][j] && grid[i][j] == '1') {
                    count++;
                    LinkedList<Integer> queue = new LinkedList<>();
                    queue.addLast(i * cols + j);
                    marked[i][j] = true;
                    while (!queue.isEmpty()) {
                        int cur = queue.removeFirst();
                        int curX = cur / cols;
                        int curY = cur % cols;
                        for (int k = 0; k < 4; k++) {
                            int newX = curX + directions[k][0];
                            int newY = curY + directions[k][1];
                            if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == '1' && !marked[newX][newY]){
                                queue.addLast(newX * cols + newY);
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
