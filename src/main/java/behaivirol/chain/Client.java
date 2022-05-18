package behaivirol.chain;

public class Client {


    public static void main(String[] args) {
        Request request = new Request();

        RequestHandler handler = new AuthHandler(new ActionHandler(null));

        handler.handle(request);
    }
}
