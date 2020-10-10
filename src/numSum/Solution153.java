package numSum;

/**
 * @description: 153.寻找旋转数组中的最小值
 * @author: Yuner
 * @create: 2020-10-10 14:40
 **/
public class Solution153 {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int left = 0, right = n - 1;
        if (nums[right] > nums[left])
            return nums[left];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid])
                return nums[mid];

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
