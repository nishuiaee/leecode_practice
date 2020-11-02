package Offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-29 20:29
 **/
public class Offer33_2 {
    public boolean verifyPostorder(int[] postorder) {
        Deque<Integer> deque = new LinkedList<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;
            while (!deque.isEmpty() && deque.peek() > postorder[i]) {
                root = deque.pop();
            }
            deque.add(postorder[i]);
        }
        return true;
    }
}
