package Contest.Contest11_29;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-29 18:46
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
