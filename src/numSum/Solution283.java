package numSum;

/**
 * @description: 283.移动零
 * @author: Yuner
 * @create: 2020-11-30 22:14
 **/
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
