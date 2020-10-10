package DesignPattern.Sigleton;

/**
 * @description: 静态内部类实现
 * @author: Yuner
 * @create: 2020-10-10 09:31
 **/
public class Singleton5 {
    private Singleton5() {}

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}
