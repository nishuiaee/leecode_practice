package DesignPattern.Command;

/**
 * @description: 具体命令角色类
 * @author: Yuner
 * @create: 2020-11-29 18:33
 **/
public class ConcreteCommand implements Command{
    private Receiver receiver = null;
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
