package Contest.Contest11_30;

import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-30 19:02
 **/
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length, m = nums2.length;
        int left = 0, right = n - 1;
        int median1 = 0, median2 = 0;
        while (left <= right) {
            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;
            int nums1_l = i == 0 ? Integer.MIN_VALUE: nums1[i - 1];
            int nums1_r = i == n ? Integer.MAX_VALUE : nums1[i];
            int nums2_l = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2_r = j == m ? Integer.MAX_VALUE : nums2[j];

            if (nums1_l <= nums2_r) {
                left = i + 1;
                median1 = Math.max(nums1_l, nums2_l);
                median2 = Math.min(nums1_r, nums2_r);
            } else {
                right = i - 1;
            }
        }
        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }
}
