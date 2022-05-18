책임 연쇄 패턴
===

1. 요청을 보내는 쪽(sender)과 요청을 처리하는 쪽(receiver)의 분리하는 패턴
2. 클라이언트 코드를 변경하지 않고 새로운 핸들러를 체인에 추가할 수 있다
3. 각각의 체인은 자신이 해야하는 일만 한다.
4. 각 핸들러들은 다음 핸들러 앞 뒤로 기능을 추가할 수 있다. 

<br>

핸들러 인터페이스

```java
public interface RequestHandler {
    void handle(Request request);
}
```

<br>
핸들러 구체 클래스

```java
public class ActionHandler implements RequestHandler {

    private RequestHandler nextHandler;

    public ActionHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("액션!");
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}


public class AuthHandler implements RequestHandler {

    private RequestHandler nextHandler;

    public AuthHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증!");
        if(nextHandler!=null){
            nextHandler.handle(request);
        }
    }
}
```


<br>
사용 부분

```java
public class Client {


    public static void main(String[] args) {
        Request request = new Request();

        RequestHandler handler = new AuthHandler(new ActionHandler(null));

        handler.handle(request);
    }
}
```

생성자를 통해 다음으로 처리할 핸들러를 정한다.