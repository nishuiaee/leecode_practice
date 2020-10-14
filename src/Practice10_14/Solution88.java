package Practice10_14;

import java.util.Arrays;

/**
 * @description: 88.合并两个有序数组
 * @author: Yuner
 * @create: 2020-10-14 15:38
 **/
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int count = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] >= nums2[j]) {
                nums[count++] = nums2[j++];
            } else {
                nums[count++] = nums1[i++];
            }
        }
        while (i < m) {
            nums[count++] = nums1[i++];
        }
        while (j < n) {
            nums[count++] = nums2[j++];
        }
        System.arraycopy(nums,0,nums1,0,count);
    }
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int p = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[p--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        System.arraycopy(nums2,0,nums1,0,j + 1);
    }

    public static void main(String[] args) {
        int nums1[] = new int[]{1,2,3,0,0,0};
        new Solution88().merge(nums1,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(nums1));
    }
}
