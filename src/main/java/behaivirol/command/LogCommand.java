package behaivirol.command;

public class LogCommand implements Command {

    private MyLog myLog;

    public LogCommand(MyLog myLog) {
        this.myLog = myLog;
    }

    @Override
    public void execute() {
        myLog.log();
    }
}
