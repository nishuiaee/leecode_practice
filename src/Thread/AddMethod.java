package Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 两个线程实现1加到199
 * @author: Yuner
 * @create: 2020-09-25 18:45
 **/
public class AddMethod {
    private static AtomicInteger a = new AtomicInteger(1);

    public static void main(String[] args) {

        for(int i = 0; i < 99; i++) {
            new Thread(() -> {
                a.getAndIncrement();
            }).start();

            new Thread(() -> {
                a.getAndIncrement();
            }).start();
        }
        System.out.println(a);
    }
}
