package DesignPattern.Factory;

/**
 * @description: 简单工厂的实现
 * @author: Yuner
 * @create: 2020-10-10 16:42
 **/
public class SimpleFactory {

    public Product createProduct (int type) {
        if (type == 1){
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        } else {
            return new ConcreteProduct();
        }
    }
}
