package Thread.PrintOddandeven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 使用锁 ReentrantLock和Condition
 * @author: Yuner
 * @create: 2020-09-26 16:13
 **/
public class PrintOddAndEven3 {
    private static int count = 0;

    private static final ReentrantLock lock = new ReentrantLock();
    private static final Condition condition1 = lock.newCondition();
    private static final Condition condition2 = lock.newCondition();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() -> {
            while (count <= 100) {
                try {
                    lock.lock();
                    System.out.println("偶数" + count++);
                    condition1.await();
                    condition2.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        executorService.execute(() -> {
            while (count <= 100) {
                try {
                    lock.lock();
                    System.out.println("奇数" + count++);
                    condition1.signal();
                    condition2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
    }
}
