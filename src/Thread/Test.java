package Thread;

/**
 * @description: 多线程打印
 * @author: Yuner
 * @create: 2020-10-09 21:09
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException{
        int[] nums = {3,3,8,2,0,1,9,8,3,5,8,3,0};

        for (int i = 0; i < 10; i++) {
            new Thread(new Printer(i)).start();
        }

        for (int i = 0; i < nums.length; i++) {
            synchronized (Printer.candidate) {
                Printer.candidate[nums[i]] = true;
                Printer.candidate.notifyAll();
                Printer.candidate.wait();
            }
        }
    }
}
