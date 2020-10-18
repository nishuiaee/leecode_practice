package numSum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description: 137.只出现一次的数字
 * @author: Yuner
 * @create: 2020-10-15 15:55
 **/
public class Solution137 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int i = 0; i < nums.length; i++) {
            ones = ones ^ nums[i] & ~twos;
            twos = ones ^ nums[i] & ~ones;
        }

      return ones;
    }
    public int temp(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i],map.get(nums[i]) + 1);
            }
            else
                map.put(nums[i],1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
