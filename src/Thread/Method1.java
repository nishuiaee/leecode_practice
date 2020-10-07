package Thread;

/**
 * @description: 设计一个多线程打印程序，第i个线程只打印i-1数字，比如第1个线程打印数字0，第2个线程只打印数字1，依次类推。
 * 任意给定一个数字序列，比如3382019835830，能够使用该程序打印出来。
 * @author: Yuner
 * @create: 2020-10-04 20:05
 **/
public class Method1 {

    private volatile int num;

    static class PrintNumber implements Runnable {
        private int i;
        private Method1 method1;

        public PrintNumber(int i,Method1 method1) {
            this.method1 = method1;
            this.i = i;
        }

        @Override
        public void run() {
            while(method1.num == i){
                System.out.println(i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Method1 method1 = new Method1();
        String a = "3382021313";
        for (int i = 0; i < a.length(); i++) {
            int temp = a.charAt(i) - '0';
            method1.num = temp;
        }

    }
}
