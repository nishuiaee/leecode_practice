package Thread.PrintOddandeven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 使用volitile关键字
 * @author: Yuner
 * @create: 2020-09-26 15:57
 **/
public class PrintOddAndEven2 {
    private static AtomicInteger count = new AtomicInteger(0);

    private volatile static boolean flag = true;

    static class PrintThread1 implements Runnable {
        @Override
        public void run() {
            while (count.get() <= 100) {
                if (flag) {
                    System.out.println("偶数" + count.getAndIncrement());
                    flag = false;
                }
            }
        }
    }
    static class PrintThread2 implements Runnable {
        @Override
        public void run() {
            while(count.get() <= 100) {
                if(!flag) {
                    System.out.println("奇数" + count.getAndIncrement());
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        //new Thread(new PrintThread1()).start();
        //new Thread(new PrintThread2()).start();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() -> {
            while (count.get() <= 100) {
                if(flag) {
                    System.out.println("偶数" + count.getAndIncrement());
                    flag = false;
                }
            }
        });

        executorService.execute(() -> {
            while (count.get() <= 100) {
                if(!flag) {
                    System.out.println("奇数" + count.getAndIncrement());
                    flag = true;
                }
            }
        });
    }
}
