package Contest_ByteDance.day1;

import java.util.Arrays;

/**
 * @description: 第K大的数
 * @author: Yuner
 * @create: 2020-10-28 13:37
 **/
public class Solution215_heap {
    private void heapify (int[] nums,int i, int n) {
        if (i >= n) {
            return;
        }
        int max = i;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        if (c1 < n && nums[c1] > nums[max]) {
            max = c1;
        }
        if (c2 < n && nums[c2] > nums[max]) {
            max = c2;
        }
        if (max != i) {
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
            heapify(nums, max, n);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        int last_node = nums.length - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(nums, i, nums.length);
        }

        for (int n = nums.length - 1; n >= 0; n--) {
            int temp = nums[0];
            nums[0] = nums[n];
            nums[n] = temp;
            heapify(nums,0 , n);
        }
        return nums[nums.length - k];
    }
    public static void main(String[] args) {
        int[] nums = {4, 10, 3, 5, 1, 2};
        //new Select().Select(nums);
        new Solution215_heap().findKthLargest(nums,0);
        System.out.println(Arrays.toString(nums));
    }
}
