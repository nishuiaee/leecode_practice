package numSum;

//88.合并两个有序数组
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int p = m + n - 1;
        while(i >= 0 && j >= 0)
            nums1[p--] = (nums1[i] < nums2[j]) ? nums2[j--] : nums1[i--];
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }
}
