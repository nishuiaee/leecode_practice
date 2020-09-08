package numSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class temp {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;

        for(int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) return list;

            if (k > 0 && nums[k] == nums[k - 1]) continue;

            int i = k + 1, j = nums.length - 1;

            while(i < j) {
                sum = nums[k] + nums[i] + nums[j];
                if(sum == 0) {
                    list.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                } else if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]);
                } else {
                    while(i < j && nums[i] == nums[++i]);
                }
            }
        }
        return list;
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        sum = nums[0] + nums[1] + nums[2];

        for (int k = 0; k < nums.length - 2; k++) {

            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;

            while (i < j) {
               int sumtemp = nums[k] + nums[i] + nums[j];
               if(Math.abs(target - sumtemp) < Math.abs(target - sum))
                   sum = sumtemp;
               if(sumtemp > target) {
                   while(i < j && nums[j] == nums[--j]);
               } else if (sumtemp < target) {
                   while(i < j && nums[i] == nums[++i]);
               } else {
                   return sumtemp;
               }
            }
        }

        return sum;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int k = 0; k < nums.length - 3; k++) {
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            for(int h = k + 1; h < nums.length - 2; h++) {
                if(h > k + 1 && nums[h] == nums[h - 1]) continue;

                int i = h + 1, j = nums.length -1;
                while(i < j) {
                    int sum = nums[k] + nums[h] + nums[i] + nums[j];
                    if (sum > target) {
                        while(i < j && nums[j] == nums[--j]);
                    } else if (sum < target) {
                        while (i < j && nums[i] == nums[++i]);
                    } else {
                        list.add(new ArrayList<>(Arrays.asList(nums[k],nums[h],nums[i],nums[j])));
                        while (i < j && nums[i] == nums[++i]);
                        while (i < j && nums[j] == nums[--j]);
                    }
                }
            }
        }
        return list;
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap();
        hashMap.put(nums[0],0);
        for(int i = 1; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }

    public int maxArea(int[] height) {

        int max = 0;
        int i = 0, j = height.length - 1;
        while(i < j) {
            int volume = Math.min(height[i],height[j]) * (j - i);
            if (volume > max) max = volume;
            if(height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums1,nums2);
        }
        int m = nums1.length;
        int n = nums2.length;
        int left = 0, right = m;
        int median1 = 0, median2 = 0;

        while(left <= right) {

            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;

            int nums_im1 = (i==0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int nums_i = (i == m ? Integer.MAX_VALUE : nums1[i]);
            int nums_jm1 = (j==0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int nums_j = (j==n ? Integer.MAX_VALUE : nums2[j]);

            if(nums_im1 <= nums_j) {
                median1 = Math.max(nums_im1, nums_im1);
                median2 = Math.min(nums_i, nums_j);
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        return (m+n) % 2 == 0 ?(median1 + median2) / 2.0 : median1;
    }
}
