package Review.day10_24;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-24 11:54
 **/
public class Selection {

    public void SelectSort (int[] nums) {
       int len = nums.length;

       for (int i = 0; i < len; i++) {
           int min = i;
           for (int j = i + 1; j < len; j++ ) {
               if (nums[j] < nums[min])
                   min = j;
           }
           if (min != i){
               int temp = nums[i];
               nums[i] = nums[min];
               nums[min] = temp;
           }
       }
    }

    private void heapify(int[] nums, int i, int n) {
        if (i >= n) {
            return ;
        }

        int max = i;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        if (c1 < n && nums[c1] > nums[max])
            max = c1;
        if (c2 < n && nums[c2] > nums[max])
            max = c2;
        if (max != i) {
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
            heapify(nums,max,n);
        }
    }

    public void heapSort (int[] nums) {
        int len = nums.length;
        int last_node = len - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(nums, i, len);
        }
        for (int n = last_node; n >= 0; n--) {
            int temp = nums[0];
            nums[0] = nums[n];
            nums[n] = temp;
            heapify(nums, 0, n);
        }
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,54,64,5,2,52,526,2,5};
        //new Selection().SelectSort(nums);
        new Selection().heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
