package Thread.Foundation;

/**
 * @description: 继承Thread方式
 * @author: Yuner
 * @create: 2020-10-19 08:51
 **/
public class ExtendsThread extends Thread {

    @Override
    public void run(){
        System.out.println("继承方式");
    }

    public static void main(String[] args) {
        new ExtendsThread().start();
    }
}
