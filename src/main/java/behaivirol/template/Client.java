package behaivirol.template;

public class Client {

    public static void main(String[] args) {
        CallbackType callbackType = new CallbackType();

        callbackType.run(()->{
            System.out.println("가운데 동작");
        });
    }
}
