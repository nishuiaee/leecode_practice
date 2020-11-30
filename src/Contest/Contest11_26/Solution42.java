package Contest.Contest11_26;

/**
 * @description: 42.接雨水
 * @author: Yuner
 * @create: 2020-11-26 16:30
 **/
public class Solution42 {
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int res = 0;
        int[] dp_left = new int[height.length];
        int[] dp_right = new int[height.length];
        dp_left[0] = height[0];
        dp_right[0] = height[len - 1];
        for (int i = 1; i < len; i ++) {
            dp_left[i] = Math.max(dp_left[i - 1], height[i]);
        }
        for (int i = len - 2; i >= 0; i++) {
            dp_right[i] = Math.max(dp_right[i + 1], height[i]);
        }
        for (int i = 1; i < len - 1; i++) {
            res += Math.min(dp_left[i],dp_right[i]) - height[i];
        }
        return res;
    }
}
