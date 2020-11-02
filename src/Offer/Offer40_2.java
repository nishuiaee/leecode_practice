package Offer;

import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 10:48
 **/
public class Offer40_2 {

    Random random = new Random();

    private void quick_sort(int[] arr, int start, int end, int k) {
        if (start < end) {
            int i = start, j = end;
            int vot = random.nextInt(j - i + 1) + i;
            int temp = arr[vot];
            arr[vot] = arr[i];
            arr[i] = temp;
            int vot1 = arr[i];
            while (i != j)
            {
                while (i < j && arr[j] >= vot1) j--;
                if (i < j) arr[i++] = arr[j];
                while (i < j && arr[i] <= vot1) i++;
                if (i < j) arr[j--] = arr[i];
            }
            arr[i] = vot1;
            if (i > k - 1) quick_sort(arr, 0, i - 1, k);
            else if (i < k - 1) quick_sort(arr, i+1 , end, k);
            else return;
        }
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        quick_sort(arr, 0, arr.length - 1, k);
        int[] nums = new int[k];
        System.arraycopy(arr, 0, nums,0,k);
        return nums;
    }
}
