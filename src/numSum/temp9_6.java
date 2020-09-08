package numSum;

/**
 * @description: 9月6日复习
 * @author: Yuner
 * @create: 2020-09-06 17:24
 **/
public class temp9_6 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0, j = 1;
        for(;j < nums.length;j++)
        {
            if(nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int i = 0, j = 0;
        for(;j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
