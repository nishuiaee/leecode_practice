package Offer;

import java.util.HashSet;

/**
 * @description: 03.数组中重复的数字
 * @author: Yuner
 * @create: 2020-10-10 09:58
 **/
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return nums[i];
            }
            hashSet.add(nums[i]);
        }
        return 0;
    }
}
