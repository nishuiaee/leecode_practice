package numSum;

//724.寻找数组的中心索引
public class Solution724 {
    public int pivotIndex(int[] nums) {
      int sum = 0;
      int leftsum = 0;

      for (int num : nums) {
          sum += num;
      }

      for (int i = 0; i < nums.length; i++) {
          if (sum - leftsum - nums[i] == leftsum) {
              return i;
          }
          leftsum += nums[i];
      }

      return -1;
    }
}
