package Contest;

import java.util.Arrays;

/**
 * @description: 交换排序
 * 快速排序和冒泡排序
 * @author: Yuner
 * @create: 2020-10-22 09:49
 **/
public class Exchange {
    public void bubbleSort (int[] nums) {
        boolean flag = true;

        for (int i = 1; i < nums.length && flag; i++) {
            flag = false;

            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    flag = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort1(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort (int[] nums, int start, int end) {
        int i = start, j = end;

        if (i < j) {
            int vot = nums[i];
            while (i != j) {
                while (i < j && nums[j] >= vot) j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] <= vot) i++;
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = vot;
            quickSort(nums, start,i - 1);
            quickSort(nums, i + 1, end);
        }

    }
    public static void main(String[] args) {
        int[] num = {1,4,5,6,3,1,5,624,54324,14,141};
        new Exchange().bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
}
