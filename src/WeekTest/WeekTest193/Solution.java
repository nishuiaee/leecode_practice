package WeekTest.WeekTest193;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {


    public int[] runningSum(int[] nums) {
        int[]  temp = new int[nums.length];
        temp[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            temp[i] = temp[i-1] + nums[i];
        }
        return temp;
    }

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i]))
            {
                int a = map.get(arr[i]) + 1;
                map.replace(arr[i],a);
            }
            else
                map.put(arr[i],1);
        }
        int count = 1;
        int num = 1;
        while(k > 0)
        {
            Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer,Integer> entry = iterator.next();
                iterator.remove();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int num[] = {1,3,4,5,1,3,4};
        s.findLeastNumOfUniqueInts(num,10);
    }
}
