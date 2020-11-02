package Contest_ByteDance.day2;

/**
 * @description: 167.两数之和
 * @author: Yuner
 * @create: 2020-10-28 15:51
 **/
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (l < r && sum > target) {
                r--;
            } else if (l < r && sum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return null;
    }
}
