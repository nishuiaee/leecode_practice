package Review.day10_20;

/**
 * @description: 连续子数组的最大和
 * @author: Yuner
 * @create: 2020-10-20 10:36
 **/
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = 0;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
