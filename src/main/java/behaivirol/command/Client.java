package behaivirol.command;

public class Client {



    public void main(){
        CommandCaller commandCaller = new CommandCaller(new ApiCommnad(new MyApi()));

        commandCaller.run();


    }
}
