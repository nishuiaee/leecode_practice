package Offer;

import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 31栈的压入弹出序列
 * @author: Yuner
 * @create: 2020-10-13 20:12
 **/
public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;
        for (int num : pushed) {
            deque.push(num);
            while ((!deque.isEmpty()) && deque.peek() == popped[i]) {
                deque.pop();
                i++;
            }
        }
        return deque.isEmpty();
    }
}
