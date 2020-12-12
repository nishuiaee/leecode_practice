package Common;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-04 12:17
 **/
public class BlockingQueue {
    private final LinkedList<Object> list = new LinkedList<>();

    private AtomicInteger count = new AtomicInteger(0);

    private final int minSize = 0;
    private final int maxSize;

    public BlockingQueue(int size) {
        this.maxSize = size;
    }

    public BlockingQueue() {
        this(10);
    }

    private final Object lock = new Object();

    public int size() {
        return count.get();
    }

    public void put(Object obj) {
        synchronized (lock) {
            while (size() == maxSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(obj);
                count.incrementAndGet();
                System.out.println("新加入的元素:" + obj);
                lock.notify();
            }
        }
    }

    public Object take() {
        synchronized (lock) {
            while (minSize == size()) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object obj = list.removeFirst();
            count.decrementAndGet();
            lock.notify();
            return obj;
        }
    }

    public static void main(String[] args) {
        final BlockingQueue m = new BlockingQueue(5);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                m.put("a");
                m.put("b");
                m.put("c");
                m.put("d");
                m.put("e");
                m.put("f");
            }
        });
        t1.start();

        try {
            Thread.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Object o = m.take();
                System.out.println("取出的元素为:" + o);
            }
        });
        t2.start();
        try {
            Thread.sleep(10);
            System.out.println(m.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
