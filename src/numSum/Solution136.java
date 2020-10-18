package numSum;

/**
 * @description: 136.只出现一次的数字
 * @author: Yuner
 * @create: 2020-10-15 15:52
 **/
public class Solution136 {
    public int singleNumber(int[] nums) {
       int a = 0;
       for (int i = 0; i < nums.length; i++) {
           a ^= nums[i];
       }

       return a;
    }
}
