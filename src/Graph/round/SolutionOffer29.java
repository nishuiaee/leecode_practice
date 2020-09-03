package Graph.round;

//剑指offer29。顺时针打印矩阵
public class SolutionOffer29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int total = rows * columns;
        int[] nums = new int[total];
        boolean[][] flag = new boolean[rows][columns];
        int[][] index = {{0,1},{1,0},{0,-1},{-1,0}};
        int indexdirection  = 0;
        int nextrow = 0,nextcolumn = 0;
        int row = 0,column = 0;

        for(int i = 0; i < total; i++) {
            nums[i] = matrix[row][column];
            flag[row][column] = true;
            nextrow = row + index[indexdirection][0];
            nextcolumn = column + index[indexdirection][1];

            if(nextrow < 0 || nextcolumn < 0 || nextrow >= rows || nextcolumn >= columns || flag[nextrow][nextcolumn]) {
                indexdirection = (indexdirection + 1) % 4;
            }

            row += index[indexdirection][0];
            column += index[indexdirection][1];
        }
        return nums;
    }
}
