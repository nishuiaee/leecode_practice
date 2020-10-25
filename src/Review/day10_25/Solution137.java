package Review.day10_25;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 11:55
 **/
public class Solution137 {

    public int singleNumber(int[] nums) {
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < nums.length; i++) {
            n1 = (~n2) & (n1 ^ nums[i]);
            n2 = (~n1) & (n2 ^ nums[i]);
        }
        return n1;
    }
}
