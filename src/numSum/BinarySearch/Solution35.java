package numSum.BinarySearch;

/**
 * @description:35.搜索插入位置
 * @author: Yuner
 * @create: 2020-11-24 21:37
 **/
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
