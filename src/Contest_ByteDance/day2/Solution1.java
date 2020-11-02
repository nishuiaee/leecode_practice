package Contest_ByteDance.day2;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-28 14:40
 **/
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
