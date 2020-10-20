package Review.day10_20;

/**
 * @description: 42.接雨水
 * @author: Yuner
 * @create: 2020-10-20 15:19
 **/
public class Solution42 {
    public int trap(int[] height) {
        int len = height.length;
        int[] max_left = new int[len];
        int[] max_right = new int[len];
        max_left[0] = Integer.MIN_VALUE;
        max_right[0] = Integer.MIN_VALUE;
        int res = 0;

        for (int i = 0; i < len; i++) {
            max_left[i] = Math.max(max_left[i], height[i]);
        }
        for (int i = len - 1; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i],height[i]);
        }

        for (int i = 1; i < len; i++) {
            res += Math.min(max_left[i],max_right[i]) - height[i];
        }
        return res;
    }
}
