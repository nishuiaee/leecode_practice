package Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 1114.按序打印
 * @author: Yuner
 * @create: 2020-10-03 15:03
 **/
public class Solution1114 {

    private volatile int state = 0;

    public Solution1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        while(state != 0) {
            Thread.yield();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        state = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {

        while (state != 1) {
            Thread.yield();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        state = 2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (state != 2) {
            Thread.yield();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
