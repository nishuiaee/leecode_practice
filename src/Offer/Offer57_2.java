package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 和为s的连续正数序列
 * @author: Yuner
 * @create: 2020-11-03 17:33
 **/
public class Offer57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int sum = 0, bound = (target - 1) / 2;

        for (int i = 1; i <= bound; i++) {
            for (int j = i;;j++) {
                sum += j;
                if (sum > target) {
                    sum = 0;
                    break;
                } else if (sum == target) {
                    int[] nums = new int[j - i + 1];
                    for (int k = i; k <= j; k++) {
                        nums[k - i] = k;
                    }
                    res.add(nums);
                    sum = 0;
                    break;
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public int[][] find2(int target) {
        List<int[]> res = new ArrayList<>();
        int sum = 0, bound = (target - 1) / 2;
        int l = 1,r = 1;
        while (l <= bound) {
            if (sum < target) {
                sum += r;
                r++;
            } else if (sum > target) {
                sum -= l;
                l++;
            } else {
                int[] num = new int[r - l];
                for (int i = l; i < r; i++) {
                    num[i - l] = i;
                }
                res.add(num);
                sum -= l;
                l++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        new Offer57_2().find2(9);
    }
}
