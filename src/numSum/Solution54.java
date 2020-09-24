package numSum;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 螺旋矩阵
 * @author: Yuner
 * @create: 2020-09-23 20:18
 **/
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return null;

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};

        int indexdirection = 0;
        int nextrow = 0, nextcolumn = 0;
        int row = 0, column = 0;
        boolean[][] flag = new boolean[m][n];

        for (int i = 0; i < m * n; i++) {
            list.add(matrix[row][column]);
            flag[row][column] = true;
            nextrow = row +  direction[indexdirection][0];
            nextcolumn = column + direction[indexdirection][1];

            if (nextrow >= m || nextcolumn >= n || nextrow < 0 || nextcolumn < 0 || flag[nextrow][nextcolumn]) {
                indexdirection = (indexdirection + 1) % 4;
            }

            row += direction[indexdirection][0];
            column += direction[indexdirection][1];
        }
        return list;

    }
}
