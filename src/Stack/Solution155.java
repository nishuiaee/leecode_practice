package Stack;

import java.util.LinkedList;

/**
 * @description: 155.最小栈
 * @author: Yuner
 * @create: 2020-10-23 15:22
 **/
public class Solution155 {
    LinkedList<Integer> linkedList;
    LinkedList<Integer> minStack;

    public Solution155() {
        linkedList = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        linkedList.push(x);
        minStack.push(Math.min(x,minStack.peek()));
    }

    public void pop() {
        linkedList.pop();
        minStack.pop();
    }

    public int top() {
        return linkedList.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
