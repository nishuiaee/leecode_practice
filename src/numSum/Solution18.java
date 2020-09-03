package numSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int length = nums.length;
        int sum = 0;
        for (int a = 0; a < length - 2; a++) {
            if(a > 0 && nums[a] == nums[a - 1]) continue;
            for(int b = a + 1; b < length - 2; b++) {
                if(b > a + 1 && nums[b] == nums[b - 1]) continue;
                int i = b + 1,j = nums.length - 1;

                while (i < j) {
                    sum = nums[a] + nums[b] + nums[i] + nums[j];
                    if(target < sum) {
                        while (i < j && nums[j] == nums[--j]);
                    } else if(target > sum) {
                        while (i < j && nums[i] == nums[++i]);
                    } else {
                        lists.add(new ArrayList<>(Arrays.asList(nums[a],nums[b],nums[i],nums[j])));
                        while (i < j && nums[i] == nums[++i]);
                        while(i < j && nums[j] == nums[--j]);
                    }
                }
            }
        }
        return lists;
    }



}
