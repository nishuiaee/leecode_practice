package numSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 560.和为K的子数组
 * @author: Yuner
 * @create: 2020-11-16 16:29
 **/
public class Solution560 {
    //O(n2)迭代
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int len = nums.length;

        for (int left = 0; left < len; left++) {
            int sum = 0;
            for (int right = left; right < len; right++) {
                sum += nums[right];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    //O(n2)前缀和
    public int solition2(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        preSum[0] = 0;
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int count = 0;

        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                if (preSum[right + 1] - preSum[left] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    //O(n)前缀和
    public int solution3(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int pre = 0;
        int count = 0;
        for (int num : nums) {
            pre += num;
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
