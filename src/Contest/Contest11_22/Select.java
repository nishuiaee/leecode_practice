package Contest.Contest11_22;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-22 15:27
 **/
public class Select {
    public void SelectSort(int[] nums) {
        int len = nums.length;
        int min = 0;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i; j < len; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }


    private void heapify(int[] nums, int i, int n) {
        if (i >= n) {
            return;
        }

        int max = i;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        if(c1 < n && nums[c1] > nums[max]) {
            max = c1;
        }
        if (c2 < n && nums[c2] > nums[max]) {
            max = c2;
        }

        if (max != i) {
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
            heapify(nums, max, n);
        }
    }

    public void heapSort(int[] nums) {
        int last_node = nums.length - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(nums, i, nums.length);
        }

        for(int n = nums.length - 1; n >= 0; n--) {
            int temp = nums[0];
            nums[0] = nums[n];
            nums[n] = temp;
            heapify(nums, 0, n);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 3, 5, 1, 2, 12};
        //new Select().Select(nums);
        //new Select().heapSort(nums);
        new Select().SelectSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
