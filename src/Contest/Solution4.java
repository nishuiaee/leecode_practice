package Contest;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-23 21:09
 **/
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       if (nums1.length > nums2.length) {
           return findMedianSortedArrays(nums2,nums1);
       }

       int n = nums1.length, m = nums2.length;
       int median1 = 0, median2 = 0;
       int l = 0, r = n;

       while (l <= r) {
           int i = (l + r) / 2;
           int j = (m + n + 1) / 2 - i;

           int nums1l = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
           int nums1r = i == n ? Integer.MAX_VALUE : nums1[i];
           int nums2l = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
           int nums2r = j == m ? Integer.MAX_VALUE : nums2[j];

           if (nums1l <= nums2r) {
               median1 = Math.max(nums1l,nums2l);
               median2 = Math.min(nums1r,nums2r);
               l = i + 1;
           } else {
               r = i - 1;
           }
       }
       return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }
}
