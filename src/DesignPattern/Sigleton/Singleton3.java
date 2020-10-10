package DesignPattern.Sigleton;

/**
 * @description: 线程安全懒汉式
 * @author: Yuner
 * @create: 2020-10-10 09:22
 **/
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {}

    public static synchronized Singleton3 getSingleton3() {
        if(singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
