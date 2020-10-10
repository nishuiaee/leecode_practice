package DesignPattern.Factory;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 16:55
 **/
public class ConcreteFactory extends Factory{
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
