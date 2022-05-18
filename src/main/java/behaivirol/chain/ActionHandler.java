package behaivirol.chain;

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
