package Contest.Contest11_25;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 54.螺旋矩阵
 * @author: Yuner
 * @create: 2020-11-25 10:36
 **/
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int[][] direction = {{0,1}, {1,0}, {0,-1},{-1,0}};
        int index = 0;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, cols = 0;
        int nexrow = 0, nexcols = 0;
        boolean[][] flag = new boolean[row][cols];
        for (int i = 0; i < m * n; i++) {
            res.add(matrix[row][cols]);
            flag[row][cols] = true;
            nexrow = row + direction[index][0];
            nexcols = row + direction[index][1];
            if (nexrow < 0 || nexrow >= m || nexcols < 0 || nexcols >= n || flag[nexrow][nexcols]) {
                index = (index + 1) % 4;
            }
            row = row + direction[index][0];
            cols = cols + direction[index][1];
        }
        return res;
    }
}
