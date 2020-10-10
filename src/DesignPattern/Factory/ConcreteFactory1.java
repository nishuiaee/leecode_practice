package DesignPattern.Factory;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 16:56
 **/
public class ConcreteFactory1 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
