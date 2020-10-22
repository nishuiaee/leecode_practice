package Sort;

import java.util.Arrays;

/**
 * @description: 选择排序
 * 直接选择排序和堆排序
 * @author: Yuner
 * @create: 2020-10-22 15:13
 **/
public class Select {
    public void Select (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    public void heapify (int[] nums, int i, int n) {
        if (i >= n) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && nums[c1] > nums[max]) {
            max = c1;
        }
        if (c2 < n && nums[c2] > nums[max]) {
            max = c2;
        }
        if (max != i) {
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
        }
    }

    public void heapSort (int[] nums) {
        int last_node = nums.length - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i-- ) {
            heapify(nums, i, nums.length);
        }

        for (int n = nums.length - 1; n >= 0; n--) {
            int temp = nums[n];
            nums[n] = nums[0];
            nums[0] = temp;
            heapify(nums, 0, n);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 3, 5, 1, 2};
        //new Select().Select(nums);
        new Select().heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
