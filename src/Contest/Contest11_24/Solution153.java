package Contest.Contest11_24;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-24 21:58
 **/
public class Solution153 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
