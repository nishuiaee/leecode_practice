package Contest.Contest11_23;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-23 15:36
 **/
public class Singleton {
    private volatile static Singleton singleton;

    public Singleton() {
    }

    public Singleton get() {
        if (singleton == null) {
            synchronized (this.getClass()) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
