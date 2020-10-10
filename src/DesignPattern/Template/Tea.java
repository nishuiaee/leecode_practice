package DesignPattern.Template;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 21:46
 **/
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
