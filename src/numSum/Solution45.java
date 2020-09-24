package numSum;

/**
 * @description: 跳跃游戏二
 * @author: Yuner
 * @create: 2020-09-23 21:20
 **/
public class Solution45 {
    public int jump(int[] nums) {
        int end = 0;
        int maxposition = 0;
        int steps = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            maxposition = Math.max(maxposition,nums[i] + i);
            if(i == end){
                steps++;
                end = maxposition;
            }
        }
        return steps;
    }
}
