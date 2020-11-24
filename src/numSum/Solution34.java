package numSum;

/**
 * @description: 34.在排序数组中查找元素的第一个和最后一个位置
 * @author: Yuner
 * @create: 2020-09-06 17:55
 **/
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len <= 0) {
            return new int[]{-1,-1};
        }

        int first = findFirst(nums, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] >= target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        if (left < nums.length && left >= 0)
            if (nums[left] == target)
                return left;
        return -1;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
}
