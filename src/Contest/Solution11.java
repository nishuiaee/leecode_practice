package Contest;

/**
 * @description: 盛水最多的容器
 * @author: Yuner
 * @create: 2020-10-24 09:19
 **/
public class Solution11 {
    public int maxArea(int[] height) {
        int len = height.length;
        int maxValue = len * Math.min(height[0], height[len - 1]);
        int l = 0, r = len - 1;
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
            maxValue = Math.max(maxValue, (r - l) * Math.min(height[l], height[r]));
        }
        return maxValue;
    }
}
