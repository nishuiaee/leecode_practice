package Contest.Contest11_16;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-16 18:28
 **/
public class Solution560 {
    public int solution1(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        int count = 0;

        for (int left = 0; left < len; left++) {
            sum = 0;
            for (int right = left; right < len; right++) {
                sum = sum + nums[right];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int solution2(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        preSum[0] = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }

        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                if (preSum[right + 1] - preSum[left] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int solution3(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(sum, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(nums[i] - k)) {
               count += map.get(nums[i] - k);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
