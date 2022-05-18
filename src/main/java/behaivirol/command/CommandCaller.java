package behaivirol.command;

public class CommandCaller {

    private Command command;

    public CommandCaller(Command command) {
        this.command = command;
    }


    public void run(){
        command.execute();
    }
}
