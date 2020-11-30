package numSum;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-30 21:36
 **/
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
