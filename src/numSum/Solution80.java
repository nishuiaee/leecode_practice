package numSum;

/**
 * @description: 80.删除排序数组中的重复项
 * @author: Yuner
 * @create: 2020-11-30 21:37
 **/
public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 2;
        int i = 1;
        for (int j = 2; j < nums.length; j++) {
           if (nums[j] != nums[i - count + 1]) {
               i++;
               nums[i] = nums[j];
           }
        }
        return i + 1;
    }
}
