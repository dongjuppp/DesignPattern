package behaivirol.chain;

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
