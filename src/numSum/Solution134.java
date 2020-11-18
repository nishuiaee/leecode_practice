package numSum;

/**
 * @description: 134.加油站
 * @author: Yuner
 * @create: 2020-11-18 14:12
 **/
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int minValue = Integer.MAX_VALUE;
        int index = 0;
        int n = gas.length;
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += gas[i] - cost[i];
            if (a < minValue) {
                minValue = a;
                index = i;
            }
        }
        return a < 0 ? -1 : (index + 1) % n;
    }
}
