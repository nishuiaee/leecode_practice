package Review.day10_24;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 155.最小栈
 * @author: Yuner
 * @create: 2020-10-24 10:20
 **/
public class Solution155 {
    private Deque<Integer> stack;
    private Deque<Integer> minstack ;

    public Solution155() {
        stack = new LinkedList<>();
        minstack = new LinkedList<>();
        minstack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        minstack.push(Math.min(minstack.peek(),x));
    }

    public void pop() {
        stack.pop();
        minstack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
