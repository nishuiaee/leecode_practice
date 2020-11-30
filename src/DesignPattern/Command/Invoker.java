package DesignPattern.Command;

/**
 * @description: 请求者角色类
 * @author: Yuner
 * @create: 2020-11-29 18:35
 **/
public class Invoker {
    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
