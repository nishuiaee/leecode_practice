package Practice10_14;

/**
 * @description: 最大子序和
 * @author: Yuner
 * @create: 2020-10-15 10:53
 **/
public class Practice1 {
    public int maxSubArray(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1] + nums[i],nums[i]);
            max = Math.max(nums[i],max);
        }
        return max;
    }
}
