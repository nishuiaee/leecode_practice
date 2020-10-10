package Offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @description: 09.用两个栈实现队列
 * @author: Yuner
 * @create: 2020-10-10 13:52
 **/
public class Offer09 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public Offer09() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.remove());
        }
        if (stack2.isEmpty()) {
            return -1;
        }
        else {
            return stack2.remove();
        }
    }
}
