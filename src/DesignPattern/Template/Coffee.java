package DesignPattern.Template;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 21:45
 **/
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
