package DesignPattern.Command;

/**
 * @description: 客户端角色类
 * @author: Yuner
 * @create: 2020-11-29 18:36
 **/
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
