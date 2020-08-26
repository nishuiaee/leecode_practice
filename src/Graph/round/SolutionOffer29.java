package Graph.round;

//剑指offer29。顺时针打印矩阵
public class SolutionOffer29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int rows = matrix.length,colums = matrix[0].length;
        int total = rows * colums;
        int[] num = new int[total];
        boolean[][] flag = new boolean[rows][colums];
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int indexdirection = 0;
        int row = 0, column = 0;
        int nextrow = 0,nextcolumn = 0;
        for(int i = 0; i < total; i++) {

        }
    }
}
