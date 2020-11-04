package Offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 13:52
 **/
public class Offer59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int r = 0, l = -k + 1; r < nums.length; r++, l++) {
            if (l > 0 && deque.peek() == nums[l - 1])
                deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[r])
                deque.removeLast();
            deque.addLast(nums[r]);
            if (l >= 0) {
                res[l] = deque.peekFirst();
            }
        }
        return res;
    }
}
