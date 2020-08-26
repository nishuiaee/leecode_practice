package numSum;

import java.util.HashMap;

//1.两数之和
public class Solution_1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(nums[0],0);
        for(int i = 1; i < nums.length; i++) {
            int temp = target - nums[i];
            if(hashMap.containsKey(temp)) {
                return new int[] {hashMap.get(temp),i};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }
}
