package Offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 包含min函数的栈
 * @author: Yuner
 * @create: 2020-10-13 19:42
 **/
public class Offer30 {
    private Deque<Integer> deque;
    private Deque<Integer> mindeque;

    /** initialize your data structure here. */
    public Offer30() {
        deque = new LinkedList();
        mindeque = new LinkedList();
        mindeque.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        deque.push(x);
        mindeque.push(Math.min(mindeque.peek(),x));
    }

    public void pop() {
        deque.pop();
        mindeque.pop();
    }

    public int top() {
        return deque.peek();
    }

    public int min() {
        return mindeque.peek();
    }
}
