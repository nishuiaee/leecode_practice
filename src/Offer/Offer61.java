package Offer;

import java.util.HashSet;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 14:37
 **/
public class Offer61 {
    public boolean isStraight(int[] nums) {
        if(nums.length == 0)
            return false;
        int max = 0, min = 14;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            if (set.contains(nums[i])) return false;
            set.add(nums[i]);
        }
        return max - min < 5 ? true : false;
    }
}
