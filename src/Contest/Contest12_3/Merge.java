package Contest.Contest12_3;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-03 14:13
 **/
public class Merge {

   private void merge(int[] nums, int i, int mid, int j) {
        int[] temp = new int[j - i + 1];
        int low = i;
        int high = mid + 1;
        int count = 0;
        while (low <= mid && high <= j) {
            if (nums[low] < nums[high]) {
                temp[count++] = nums[low++];
            } else {
                temp[count++] = nums[high++];
            }
        }
        while (low <= mid) {
            temp[count++] = nums[low++];
        }
        while (high <= j) {
            temp[count++] = nums[high++];
        }
        System.arraycopy(temp, 0, nums, i, count);
   }
   private void mergeSort(int[] nums, int i, int j) {
       if (i < j) {
           int mid = (i + j) / 2;
           mergeSort(nums, i, mid);
           mergeSort(nums, mid + 1, j);
           merge(nums, i, mid, j);
       }
   }


    public static void main(String[] args) {
        int[] a = {2131,2131,5,124,1,53,2,43,543,6,24,1,41,51,1,4,1,41,14,14,1,15};
        new Merge().mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
