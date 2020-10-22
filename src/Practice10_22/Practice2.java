package Practice10_22;

/**
 * @description: 盛水最多的容器
 * @author: Yuner
 * @create: 2020-10-22 18:58
 **/
public class Practice2 {
    public int maxArea(int[] height) {
        int maxValue = (height.length - 1) * Math.min(height[0], height[height.length - 1]);

        int l = 0, r = height.length - 1;

        while (l < r) {
            if (height[l] <= height[r])
                l++;
            else r--;
            maxValue = Math.max(Math.min(height[l],height[r]) * (r - l), maxValue);
        }
        return maxValue;
    }
}
