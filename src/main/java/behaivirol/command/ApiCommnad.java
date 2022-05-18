package behaivirol.command;

public class ApiCommnad implements Command {

    private MyApi myApi;

    public ApiCommnad(MyApi myApi) {
        this.myApi = myApi;
    }

    @Override
    public void execute() {
        myApi.api();
    }
}
