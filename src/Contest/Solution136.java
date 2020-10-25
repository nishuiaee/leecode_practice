package Contest;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 11:53
 **/
public class Solution136 {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n ^= nums[i];
        }
        return n;
    }
}
