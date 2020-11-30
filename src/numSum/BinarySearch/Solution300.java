package numSum.BinarySearch;

/**
 * @description:300最长上升子序列
 * @author: Yuner
 * @create: 2020-11-25 09:32
 **/
public class Solution300 {

    //动态规划，O(N2)
    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    //动态规划+二分法
    public int solution2(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for (int num : nums) {
            int i = 0, j = res;
            while (i < j) {
                int m = (i + j) /2;
                if (tails[m] < num) {
                    i = m  + 1;
                }else {
                    j = m;
                }
            }
            tails[i] = num;
            if (res == j) res++;
        }
        return res;
    }
}
