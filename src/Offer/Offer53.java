package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-03 10:16
 **/
public class Offer53 {
    public int search(int[] nums, int target) {
       return helper(nums, target) - helper(nums, target - 1);
    }
    private int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
