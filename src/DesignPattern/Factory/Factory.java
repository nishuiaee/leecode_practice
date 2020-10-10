package DesignPattern.Factory;

/**
 * @description: Factory
 * @author: Yuner
 * @create: 2020-10-10 16:53
 **/
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
    }
}
