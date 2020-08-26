package numSum;

// 167.两数之和二 - 输入有序数组
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum > target && i < j) {
                j--;
            } else if (sum < target && i < j) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }
}
