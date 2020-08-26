package daily.sixmonth;

import java.util.*;

class CQueue {
    private Deque<Integer> stack1,stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while(!stack1.isEmpty()) {
                stack2.add(stack1.remove());
            }
        }
        if(stack2.isEmpty())
            return -1;
        else {
            return stack2.remove();
        }
    }
}
