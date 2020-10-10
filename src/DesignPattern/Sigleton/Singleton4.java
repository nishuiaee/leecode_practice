package DesignPattern.Sigleton;

/**
 * @description: 线程安全懒汉式
 * @author: Yuner
 * @create: 2020-10-10 09:25
 **/
public class Singleton4 {
    private volatile static Singleton4 singleton4;

    private Singleton4() {}

    public static Singleton4 getUniqueInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
