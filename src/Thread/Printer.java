package Thread;

/**
 * @description: 设计一个多线程打印程序，第i个线程只打印i-1数字，比如第1个线程打印数字0，第2个线程只打印数字1，依次类推。
 * 任意给定一个数字序列，比如3382019835830，能够使用该程序打印出来。
 * @author: Yuner
 * @create: 2020-10-09 20:56
 **/
public class Printer implements Runnable{
    static boolean[] candidate = new boolean[10];
    int num;

    public Printer(int i) {
        this.num = i;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (candidate) {
                while (candidate[num] == false) {
                    try {
                        candidate.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(num);
                candidate[num] = false;
                candidate.notifyAll();
            }
        }
    }
}
