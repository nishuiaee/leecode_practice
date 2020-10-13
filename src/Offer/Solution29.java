package Offer;

/**
 * @description: 29.顺时针打印矩阵
 * @author: Yuner
 * @create: 2020-10-13 19:22
 **/
public class Solution29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int rows = matrix.length, columns = matrix[0].length;
        int total = rows * columns;
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int index = 0;
        int[] nums = new int[total];
        boolean[][] flag = new boolean[rows][columns];
        int row = 0, column = 0;
        int nextrow = 0, nextcolumn = 0;

        for (int i = 0; i < total; i++) {
            nums[i] = matrix[row][column];
            flag[row][column] = true;
            nextrow += directions[index][0];
            nextcolumn += directions[index][1];
            if (nextrow >= matrix.length || nextcolumn >= matrix[0].length || nextrow < 0 || nextcolumn < 0 || flag[nextrow][nextcolumn]) {
                index = (index + 1) % 4;
            }
            row += directions[index][0];
            column += directions[index][1];
            nextrow = row;
            nextcolumn = column;
        }
        return nums;
    }
}
