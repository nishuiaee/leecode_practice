package Offer;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-03 17:22
 **/
public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum < target) {
                l++;
            } else if (sum > target){
                r--;
            } else {
                return new int[] {nums[l], nums[r]};
            }
        }
        return null;
    }
}
