package numSum;

/**
 * @description: 154.寻找旋转数组中的最小值
 * @author: Yuner
 * @create: 2020-10-10 15:11
 **/
public class Solution154 {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int left = 0, right = n - 1;
        if (nums[right] > nums[left])
            return nums[left];

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[left];
    }
}
