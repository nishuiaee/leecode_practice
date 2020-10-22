package Contest;






import java.util.Arrays;

/**
 * @description: 插入排序
 * 直接插入排序和希尔排序
 * @author: Yuner
 * @create: 2020-10-22 10:01
 **/
public class InsertSort {

    public void insertSort (int[] nums) {

        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int temp = nums[i];
            int j;
            for (j = i - 1; j >= 0 && nums[j] > temp; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = temp;
        }

    }

    public void shellSort (int[] nums) {
       int lens = nums.length;
       for (int delta = lens / 2; delta > 0; delta /= 2) {
           for (int i = delta; i < lens; i++) {
               int temp = nums[i];
               int j;
               for (j = i - delta; j >= 0 && nums[j] > temp; j -= delta) {
                   nums[j + delta] = nums[j];
               }
               nums[j + delta] = temp;
           }
       }
    }

    public static void main(String[] args) {
        int[] num = {1,4,5,6,3,1,5,624,54324,14,141};
        new InsertSort().insertSort(num);
        //new InsertSort().shellSort(num);
        System.out.println(Arrays.toString(num));
    }
}
