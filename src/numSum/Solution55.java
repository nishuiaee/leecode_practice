package numSum;

/**
 * @description: 跳跃游戏
 * @author: Yuner
 * @create: 2020-09-23 20:54
 **/
public class Solution55 {

    public boolean canJump(int[] nums) {
       int maxjump = 0;
       int length = nums.length;
       for(int i = 0; i < length; i++) {
           if (i <= maxjump) {
               maxjump = Math.max(maxjump, nums[i] + i);
               if (maxjump >= length - 1)
                    return true;
           }
       }
       return false;
    }
}
