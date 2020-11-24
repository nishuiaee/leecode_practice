package numSum.BinarySearch;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-24 21:27
 **/
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return new int[]{-1, -1};
        int first = findFirst(nums, target);
        if (first == -1) return new int[]{-1,-1};
        int second = findLast(nums, target);
        return new int[]{first, second};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums[left] == target)
            return left;
        return -1;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums[right - 1] == target)
            return right - 1;
        return -1;
    }
}
