package Thread.Foundation;

/**
 * @description: 实现Runnable接口
 * @author: Yuner
 * @create: 2020-10-19 08:56
 **/
public class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("实现接口");

    }

    public static void main(String[] args) {
        new Thread(new ImplementsRunnable()).start();
    }

}
