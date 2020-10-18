package numSum;

import java.util.*;

/**
 * @description: 260.只出现一次的数字
 * @author: Yuner
 * @create: 2020-10-18 20:40
 **/
public class Solution260 {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        int[] output = new int[2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> item : map.entrySet())
            if (item.getValue() == 1)
                output[idx++] = item.getKey();
            return output;
    }

    public int[] method(int[] nums) {
        int bitmask = 0;
        for (int num: nums) bitmask ^= num;
        int diff = bitmask & (-bitmask);

        int x = 0;
        for (int num : nums) if ((num & diff) != 0) x ^= num;

        return new int[]{x, bitmask ^ x};
    }
}
