package numSum.BinarySearch;

/**
 * @description: 153.搜索旋转矩阵中的最小值
 * @author: Yuner
 * @create: 2020-11-24 21:46
 **/
public class Solution153 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
