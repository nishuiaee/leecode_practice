package DesignPattern.Factory;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 16:40
 **/
public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
