package numSum;

import java.util.Arrays;

//16.最接近的三数之和
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2],sum = 0;

        for (int k = 0; k < nums.length; k++) {
            int i = k + 1, j = nums.length - 1;

            while (i < j) {
                sum = nums[k] + nums[i] + nums[j];
                if(Math.abs(sum - target) < Math.abs(ans - target))
                    ans = sum;
                if (sum > target) {
                    while(i < j && nums[j] == nums[--j]);
                } else if(sum < target) {
                    while (i < j && nums[i] == nums[++i]);
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        new Solution16().threeSumClosest(nums,1);
    }
}
