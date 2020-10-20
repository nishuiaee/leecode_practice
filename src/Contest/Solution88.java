package Contest;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-20 10:47
 **/
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length;
        int k = len1 - 1;

        while (m != 0 && n != 0){
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[k--] = nums1[m - 1];
                m--;
            } else {
                nums1[k--] = nums2[n - 1];
                n--;
            }
        }
        System.arraycopy(nums2,0, nums1, 0, n);
    }
}
