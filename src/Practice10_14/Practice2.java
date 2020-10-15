package Practice10_14;

/**
 * @description: 2.合并两个有序数组
 * @author: Yuner
 * @create: 2020-10-15 11:00
 **/
public class Practice2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n - 1;
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[size--] = nums1[i--];
            } else {
                nums1[size--] = nums2[j--];
            }
        }
        System.arraycopy(nums2,0,nums1,0,j + 1);
    }
}
