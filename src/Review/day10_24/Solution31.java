package Review.day10_24;

/**
 * @description: 下一个排列
 * @author: Yuner
 * @create: 2020-10-24 09:51
 **/
public class Solution31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 1, j = len - 2;
        while (j >= 0 && nums[j] >= nums[j + 1]) j--;
        if (j >= 0) {
            while (i > j && nums[i] <= nums[j]) i--;
            swap(nums,i,j);
        }
        reverse (nums, j + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
