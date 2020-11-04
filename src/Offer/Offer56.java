package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-03 16:59
 **/
public class Offer56 {
    public int[] singleNumbers(int[] nums) {
        int len = nums.length;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        int diff = a & (-a);
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0)
                x ^= num;
        }
        return new int[]{x, x ^ a};
    }
}
