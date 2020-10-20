package Review.day10_20;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 200.岛屿数量
 * @author: Yuner
 * @create: 2020-10-20 15:01
 **/
public class Solution200_bfs {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Deque<Integer> deque = new LinkedList();
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] flag = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !flag[i][j]) {
                    count++;
                    deque.push(i * cols + j);
                    while (!deque.isEmpty()) {
                        int temp = deque.pop();
                        int x = temp / cols;
                        int y = temp % cols;
                        for (int k = 0; k < 4; k++) {
                            int newX = x + direction[k][0];
                            int newY = y + direction[k][1];
                            if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == '1' && !flag[newX][newY]) {
                                deque.push(newX * cols + newY);
                                flag[newX][newY] = true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
