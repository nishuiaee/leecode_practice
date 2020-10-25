package Sort;

import java.util.Arrays;

/**
 * @description: 选择排序,
 * 堆排序和直接选择排序
 * @author: Yuner
 * @create: 2020-10-22 10:26
 **/
public class Select1 {

    public void selectSort (int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[i])
                    min = j;
            }
            if (min != i) {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
    private void heapify(int[] tree, int i, int n){
        if (i >= n) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && tree[c1] > tree[max]) {
            max = c1;
        }
        if (c2 < n && tree[c2] > tree[max]) {
            max = c2;
        }
        if (max != i) {
            int temp = tree[max];
            tree[max] = tree[i];
            tree[i] = temp;
            heapify(tree, max, n);
        }

    }
    public void build_heap (int[] tree) {
        int last_node = tree.length - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(tree, i, tree.length);
        }
    }
    public void heapSort(int[] nums){
        build_heap(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,54,64,5,2,52,526,2,5};
        //new InsertSort().insertSort(num);
        //new InsertSort().shellSort(num);
        //new Select().build_heap(nums);
        new Select1().heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
