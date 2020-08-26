package DynamicProgramming;

//198.打家劫舍
public class Solution198 {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int[] profit = new int[nums.length];
        profit[0] = nums[0];
        profit[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++) {
            profit[i] = Math.max(profit[i - 2]+nums[i],profit[i-1]);
        }

        return Math.max(profit[nums.length - 1],profit[nums.length - 2]);
    }
}
