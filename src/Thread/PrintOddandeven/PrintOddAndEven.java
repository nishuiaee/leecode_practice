package Thread.PrintOddandeven;

import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 使用synchronized交替打印奇偶数
 * @author: Yuner
 * @create: 2020-09-26 14:08
 **/
public class PrintOddAndEven {

    static int count = 0;
    static class PrintThread implements Runnable{
        static int value = 0;

        @Override
        public void run() {

            while (value <= 100) {
                synchronized (PrintThread.class) {
                    System.out.println(Thread.currentThread().getName() + value++);
                    PrintThread.class.notify();
                    try {
                        PrintThread.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //new Thread(new PrintThread(),"偶数").start();
        //new Thread(new PrintThread(),"奇数").start();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() -> {
            while (count <= 100) {
                synchronized (PrintOddAndEven.class) {
                    System.out.println("偶数" + count++);
                    PrintOddAndEven.class.notify();
                    try {
                        PrintOddAndEven.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        executorService.execute(() -> {
            while (count <= 100) {
                synchronized (PrintOddAndEven.class) {
                    System.out.println("奇数" + count++);
                    PrintOddAndEven.class.notify();
                    try {
                        PrintOddAndEven.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }
}
