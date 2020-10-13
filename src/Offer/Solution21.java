package Offer;

/**
 * @description: 21.调整数组顺序使奇数位于偶数前面
 * @author: Yuner
 * @create: 2020-10-13 15:38
 **/
public class Solution21 {
    public int[] exchange(int[] nums) {

        int oddi = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]&1) == 1) {
                int temp = nums[i];
                nums[i] = nums[oddi];
                nums[oddi++] = temp;
            }
        }
        return nums;
    }
}
