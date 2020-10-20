package Practice10_14;

/**
 * @description: 接雨水
 * @author: Yuner
 * @create: 2020-10-14 22:11
 **/
public class Practice9 {
    public int trap1 (int[] height) {
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size; i++) {
            int max_left = 0, max_right = 0;
            for (int j = i; j >= 0; j--) {
                max_left = Math.max(max_left,height[j]);
            }
            for (int j = i; j < size; j++) {
                max_right = Math.max(max_right,height[j]);
            }
            ans += Math.min(max_left, max_right) - height[i];
        }
        return ans;
    }

    public int trap2(int[] height) {
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        max_left[0] = height[0];
        int size = height.length;
        max_right[size - 1] = height[size - 1];
        int ans = 0;

        for (int i = 1; i < size; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i]);
        }

        for(int i = size - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i]);
        }

        for (int i = 1; i < size; i++) {
            ans += Math.min(max_left[i],max_right[i]) - height[i];
        }
        return ans;
    }

    public int trap3 (int[] height) {
       int left = 0, right = height.length - 1;
       int max_left = 0, max_right = 0;
       int ans = 0;

       while (left < right) {
           if (height[left] <= height[right]) {
               if (height[left] >= max_left){
                   max_left = height[left];
               } else {
                   ans += (max_left - height[left]);
               }
               left++;
           } else {
               if (height[right] >= max_right) {
                   max_right = height[right];
               } else {
                   ans += (max_right - height[right]);
               }
               right--;
           }
       }
       return ans;
    }
}
