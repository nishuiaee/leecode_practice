package Contest.Contest12_2;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-02 09:20
 **/
public class Select {
    public void heapify(int[] nums, int i, int n) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && nums[max] < nums[c1]) max = c1;
        if (c2 < n && nums[max] < nums[c2]) max = c2;
        if (max != i) {
            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
            heapify(nums, max, n);
        }
    }
    public void heapSort(int[] nums) {
        int len = nums.length;
        int last_node = len - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(nums, i, len);
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
