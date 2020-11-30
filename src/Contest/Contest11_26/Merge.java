package Contest.Contest11_26;

import java.util.Arrays;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-26 15:33
 **/
public class Merge {
    public void mergeSort (int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low  + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= high) {
            temp[k++] = a[j++];
        }

        System.arraycopy(temp,0,a,low,k);
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            mergeSort(nums, l, mid, r);
        }
    }
   private void mergeSort(int[] nums) {
       mergeSort(nums, 0, nums.length - 1);
   }

    public static void main(String[] args) {
        int[] a = {2131, 2131, 5, 124, 1, 53, 2, 43, 543, 6, 24, 1, 41, 51, 1, 4, 1, 41, 14, 14, 1, 15};
        new Merge().mergeSort(a);
        System.out.println(Arrays.toString(a));

    }
}
