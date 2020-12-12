package Contest.Contest12_06;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-06 10:49
 **/
public class Solution2 {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(k - nums[i])) {
                count++;
                map.remove(k - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return count;
    }
}
