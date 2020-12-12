package Contest.Contest12_2;

import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-02 09:11
 **/
public class Exechage {
    public void bubbleSort(int[] nums) {
        boolean flag = true;
        int len = nums.length;
        for (int i = 1; i < len && flag; i++) {
            flag = false;
            for (int j = 0; j < len - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    flag = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int random = new Random().nextInt(end - start + 1) + start;
            int temp = nums[random];
            nums[random] = nums[start];
            nums[start] = temp;
            int vot = nums[start];
            int i = start, j = end;
            while (i != j) {
                while (i < j && nums[j] >= vot) j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] <= vot) i++;
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = vot;
            quickSort(nums, start, i - 1);
            quickSort(nums, i + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] num = {1,4,5,6,3,1,5,624,54324,14,141};
        //new Exechage().quickSort(num, 0, num.length - 1);
        new Exechage().bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
}
