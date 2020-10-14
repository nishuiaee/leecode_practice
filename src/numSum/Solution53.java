package numSum;

/**
 * @description: 53.最大子序和
 * @author: Yuner
 * @create: 2020-10-14 15:29
 **/
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
    public int maxSubArray1(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
