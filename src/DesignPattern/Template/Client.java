package DesignPattern.Template;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 21:47
 **/
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("-------------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
