package Contest;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-27 19:21
 **/
public class Select {
    public void Select(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int max = i;
            for (int j = i - 1; j >= 0; j--){
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = nums[max];
                nums[max] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public void heapify (int[] nums, int i, int n){
        if (i >= n) {
            return ;
        }

        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && nums[c1] > nums[max])
            max = c1;
        if (c2 < n && nums[c2] > nums[max])
            max = c2;
        if (max != i) {
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
            heapify(nums, max, n);
        }
    }

    public void heapSort (int[] nums) {
        int last_node = nums.length - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(nums, i, nums.length);
        }

        for (int n = nums.length - 1; n >= 0; n--) {
            int temp = nums[n];
            nums[n] = nums[0];
            nums[0] = temp;
            heapify(nums,0, n);
        }

    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 3, 5, 1, 2};
        //new Select().Select(nums);
        new Select().heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
