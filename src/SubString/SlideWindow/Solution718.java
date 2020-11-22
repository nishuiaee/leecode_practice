package SubString.SlideWindow;

/**
 * @description: 最长公共子串
 * @author: Yuner
 * @create: 2020-11-20 15:32
 **/
public class Solution718 {
    //动态规划
    public int findLength(int[] A, int[] B) {
        int len_A = A.length;
        int len_B = B.length;
        int[][] dp = new int[len_A + 1][len_B + 1];
        int max = 0;
        for (int i = 1; i < len_A; i++) {
            for (int j = 1; j < len_B; j++) {
                if (A[i - 1] == B[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = 0;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }

    //滑动窗口
    private int solution2(int[] A, int[] B) {
        return 0;
    }

}
