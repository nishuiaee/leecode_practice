package DesignPattern.Sigleton;

/**
 * @description: 单例模式 - 饿汉式 - 线程安全
 * @author: Yuner
 * @create: 2020-10-10 09:20
 **/
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getSingleton2() {
        return singleton2;
    }
}
