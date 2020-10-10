package Offer;

/**
 * @description: 04.二维数组中的查找
 * @author: Yuner
 * @create: 2020-10-10 10:04
 **/
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int n = matrix.length, m = matrix[0].length;
        int row  = 0, column = m - 1;
        while (row < n && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
