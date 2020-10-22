package Practice10_22;

/**
 * @description: 寻找两个正序数组的中位数
 * @author: Yuner
 * @create: 2020-10-22 09:10
 **/
public class Practice1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0, right = m;
        int median1 = 0, median2 = 0;
        while (left <= right) {
            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;

            int nums_1l = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int nums_1r = (i == m ? Integer.MAX_VALUE : nums1[i]);
            int nums_2l = (j == 0? Integer.MIN_VALUE : nums2[j - 1]);
            int nums_2r = (j == n ? Integer.MAX_VALUE : nums2[j]);

            if (nums_1l <= nums_2r) {
                median1 = Math.max(nums_1l,nums_2l);
                median2 = Math.min(nums_1r,nums_2r);
                left = left + 1;
            } else {
                right = right - 1;
            }
        }

        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }
}
