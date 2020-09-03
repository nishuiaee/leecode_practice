package numSum;

public class Solution4temp {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int median1 = 0, median2 = 0;
        int left = 0, right = m;

        while (left <= right) {
            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;

            int leftnums1 = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int leftnums2 = ( j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int rightnums1 = ( i == m ? Integer.MAX_VALUE : nums1[i ]);
            int rightnums2 = ( j == n  ? Integer.MAX_VALUE : nums2[j]);

            if(leftnums1 < rightnums2) {
                median1 = Math.max(leftnums1,leftnums2);
                median2 = Math.min(rightnums1, rightnums2);
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        return (m + n) % 2 == 0 ? (median1 + median2) /2.0 : median1;
    }
}
