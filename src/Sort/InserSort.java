package Sort;

import java.util.Arrays;

/**
 * @description: 直接插入排序
 * 希尔排序
 * @author: Yuner
 * @create: 2020-10-14 10:12
 **/
public class InserSort {
    public void inserSort(int[] nums) {
       int len = nums.length;

       for (int i = 1; i < len; i++) {
           int temp = nums[i];
           int j;
           for (j = i - 1;j >= 0 && nums[j] > temp; j--) {
               nums[j + 1] = nums[j];
           }
           nums[j + 1] = temp;
       }
    }

    public void shellSort(int[] nums) {
        int len = nums.length;
        for (int delta = len / 2; delta > 0; delta /= 2) {
            for (int i = delta; i < len; i++) {
                int temp = nums[i];
                int j;
                for (j = i - delta; j >= 0 && nums[j] > temp; j-= delta) {
                    nums[j + delta] = nums[j];
                }
                nums[j + delta] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,4,5,6,3,1,5,624,54324,14,141};
        //new InserSort().inserSort(num);
        new InserSort().shellSort(num);
        System.out.println(Arrays.toString(num));
    }
}
