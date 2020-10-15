package numSum;

/**
 * @description: 137.只出现一次的数字
 * @author: Yuner
 * @create: 2020-10-15 15:55
 **/
public class Solution137 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
