package Contest_ByteDance.day1;

import Sort.Select;

import java.util.Arrays;
import java.util.Random;

/**
 * @description: 快速排序
 * @author: Yuner
 * @create: 2020-10-28 13:59
 **/
public class Solution215_quick extends Object{

    public void quickSort(int[] nums,int start, int end, int target) {
        if (start < end) {
            int i = start, j = end;
            int random =  new Random().nextInt(j - i + 1) + i;
            int temp = nums[i];
            nums[i] = nums[random];
            nums[random] = temp;
            int vot = nums[i];
            while (i != j) {
                while (i < j && nums[j] >= vot) j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] <= vot) i++;
                if (i < j) nums[j--] = nums[i];

            }
            nums[i] = vot;
            if (i == nums.length - target)
                return ;
            else if (i < nums.length - target)
                quickSort(nums, i + 1, end, target);
            else
                quickSort(nums, start, i - 1,target);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k);
        return nums[nums.length - k];
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] nums = {4, 10, 3, 5, 1, 2};
        //new Select().Select(nums);
        Select sort = new Select();
        Select s = (Select)sort.clone();
        new Solution215_quick().findKthLargest(nums,1);
        System.out.println(Arrays.toString(nums));
    }
}
