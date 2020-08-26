package Weektest192;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leecode192 {
    public int[] shuffle(int[] nums, int n) {
        int[] tempnum = new int[n*2];
        int a = 0;
        int b = n;
        for(int i = 0; i < 2*n; i++){
            if(i%2 == 0)
                tempnum[i] = nums[a++];
            else
                tempnum[i] = nums[b++];
        }
        return tempnum;
    }

    public int[] getStrongest(int[] arr, int k) {
        int[] num = new int[k];
        List<Integer> temp = new ArrayList<Integer>();
        num[0] = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            temp.add(arr[i]);
        }
        Collections.sort(temp);
        int medium = temp.get((arr.length-1)/2);
        int start = 0;
        int end = arr.length-1;
        for(int i = 0; i < k; i++)
        {
            if(Math.abs(temp.get(start)-medium) > Math.abs(temp.get(end)-medium))
                num[i] = temp.get(start++);
            else if (Math.abs(temp.get(start)-medium) == Math.abs(temp.get(end)-medium) && temp.get(start) >= temp.get(end))
                num[i] = temp.get(start++);
            else if(Math.abs(temp.get(start)-medium) == Math.abs(temp.get(end)-medium) && temp.get(start) < temp.get(end))
                num[i] = temp.get(end--);
            else
                num[i] = temp.get(end--);
        }
        return num;
    }


}
