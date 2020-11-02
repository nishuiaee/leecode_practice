package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 10:27
 **/
public class Offer39 {

    public int majorityElement(int[] nums) {
        int votes = 0, mode = nums[0];
        for (int num : nums) {
            if (votes == 0) mode = num;
            if (num == mode) votes++;
            else votes--;
        }
        return mode;
    }
}
