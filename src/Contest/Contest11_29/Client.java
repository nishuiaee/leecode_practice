package Contest.Contest11_29;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-29 18:48
 **/
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandConcreate(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }


}
