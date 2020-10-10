package DesignPattern.Sigleton;

/**
 * @description: 单例模式 - 懒汉式 - 线程不安全
 * @author: Yuner
 * @create: 2020-10-10 09:16
 **/
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
