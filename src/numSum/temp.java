package numSum;

import java.util.*;

public class temp {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return null;
        }
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();

        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, target, res, path);
        return res;
    }
    private void dfs(int[] candidates, int begin, int target, List<List<Integer>> res, Deque<Integer> path) {
        if(target < 0) return;
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for( int i = begin; i < candidates.length; i++) {
            if(target - candidates[i] < 0) break;
            if(i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.addLast(candidates[i]);
            dfs(candidates,i + 1,target - candidates[i],res,path);
            path.removeLast();
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if(i >= 0) {
            int j = nums.length - 1;
            while(j > i && nums[i] >= nums[j])
                j--;
            swap(nums,i,j);
        }
        reverse(nums, i + 1);
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            mid = (left + right) / 2;
            if(nums[mid] > target) {
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

}
