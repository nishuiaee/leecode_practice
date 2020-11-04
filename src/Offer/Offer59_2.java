package Offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 14:18
 **/
public class Offer59_2 {
    private Queue<Integer> queue;
    private Deque<Integer> maxqueue;

    public Offer59_2() {
        queue = new LinkedList();
        maxqueue = new LinkedList();
    }

    public int max_value() {
       if (maxqueue.isEmpty())
           return -1;
       return maxqueue.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!maxqueue.isEmpty() && maxqueue.peekLast() < value)
            maxqueue.pollLast();
        maxqueue.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty())
            return -1;
        int temp = queue.poll();
        if (temp == maxqueue.peekFirst())
            maxqueue.poll();
        return temp;
    }
}
