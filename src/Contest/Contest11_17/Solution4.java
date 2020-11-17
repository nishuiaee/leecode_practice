package Contest.Contest11_17;

/**
 * @description: 4.寻找两个正序数组的中位数
 * @author: Yuner
 * @create: 2020-11-17 17:05
 **/
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int left = 0, right = n;
        int median1 = 0, median2 = 0;

        while (left <= right) {
            int i = left + ((right - left) >> 1);
            int j = (m + n + 1) / 2 - i;

            int n1_l = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int n1_r = i == m ? Integer.MAX_VALUE : nums1[i];
            int n2_l = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
            int n2_r = j == n ? Integer.MAX_VALUE : nums2[j];

            if (n1_l <= n2_r) {
                median1 = Math.max(n1_l,n2_l);
                median2 = Math.min(n1_r, n2_r);
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        return (m + n ) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }
}
