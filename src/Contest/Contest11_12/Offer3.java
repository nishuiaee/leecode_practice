package Contest.Contest11_12;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 09:34
 **/
public class Offer3 {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return nums[i];
            map.put(nums[i], i);
        }
        return -1;
    }
    public int solution2(int[] nums) {
        int len = nums.length;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++ ) {
            temp[nums[i]]++;
            if (temp[nums[i]] > 1)
                return nums[i];
        }
        return -1;
    }

    public int solution3(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if (i == nums[i])
                continue;
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }
            int temp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = temp;
        }
        return -1;
    }
}
