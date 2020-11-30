package Contest.Contest11_29;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-29 18:44
 **/
public class CommandConcreate implements Command{
    Receiver receiver = null;

    public CommandConcreate(Receiver receiver) {
       this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
