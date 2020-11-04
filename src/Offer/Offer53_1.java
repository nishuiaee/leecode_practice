package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-03 10:36
 **/
public class Offer53_1 {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
