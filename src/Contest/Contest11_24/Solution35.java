package Contest.Contest11_24;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-24 18:23
 **/
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left + 1;
    }
}
