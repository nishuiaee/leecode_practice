package numSum;

/**
 * @description: 42.接雨水
 * @author: Yuner
 * @create: 2020-09-14 16:33
 **/
public class Solution42 {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                int a = height[left] >= left_max ? (left_max = height[left]) : (ans += (left_max - height[left]));
                ++left;
            }
            else {
                int a = (height[right] >= right_max) ? (right_max = height[right]) : (ans += (right_max - height[right]));
                --right;
            }
        }
        return ans;
    }
}
