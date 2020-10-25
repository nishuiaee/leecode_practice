package Review.day10_25;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 12:00
 **/
public class Solution260 {
    public int[] singleNumber(int[] nums) {
       int bitmask = 0;

       for (int num : nums) {
           bitmask ^= num;
       }

       int diff  = bitmask & (-bitmask);

       int x = 0;
       for (int num : nums) {
           if ((diff & num) != 0)
               x ^= num;
       }
       return new int[]{x,bitmask ^ x};
    }
}
