package Offer;

/**
 * @description:只出现一次的数字2
 * @author: Yuner
 * @create: 2020-11-03 17:06
 **/
public class Offer56_2 {
    public int singleNumber(int[] nums) {
        int n1 = 0, n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            n1 = ~n2 & (n1 ^ nums[i]);
            n2 = ~n1 & (n2 ^ nums[i]);
        }
        return n1;
    }
}
