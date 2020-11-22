package Contest.Contest11_22;

import java.util.Arrays;

/**
 * @description: 交换排序
 * @author: Yuner
 * @create: 2020-11-22 15:15
 **/
public class Exchange {
    public void bubbleSort(int[] nums) {
        int len = nums.length;
        boolean flag = true;
        for (int i = 1; i < len && flag; i++) {
            flag = false;
            for (int j = 0; j < len - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
        }
    }

    private void quickSort(int[] nums, int start, int end) {
        int i = start, j = end;
        int vot = nums[start];
        if (start < end) {
            while (i != j) {
                while (i < j && nums[j] >= vot) j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] <= vot) i++;
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = vot;
            quickSort(nums, i + 1, end);
            quickSort(nums, start, i - 1);
        }
    }

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] num = {1,4,5,6,3,1,5,624,54324,14,141};
        new Exchange().bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
}
