package numSum;

public class Solution11 {

    public int maxArea(int[] height) {
        int volum = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            volum = Math.max(volum, Math.min(height[left],height[right]) * (right - left));
            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }
        return volum;
    }
}
