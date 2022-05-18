커맨드 패턴
===

1. 요청을 캡슐화 하여 호출자(invoker)와 수신자(receiver)를 분리하는 패턴


```java
public interface Command {

    void execute();
}
```


```java
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
```

<br>
CommandCaller 즉, 호출자의 코드는 안변함

```java
public class CommandCaller {

    private Command command;

    public CommandCaller(Command command) {
        this.command = command;
    }


    public void run(){
        command.execute();
    }
}
```


```java
public class Client {



    public void main(){
        CommandCaller commandCaller = new CommandCaller(new ApiCommnad(new MyApi()));

        commandCaller.run();


    }
}
```