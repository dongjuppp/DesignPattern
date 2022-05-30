package behaivirol.template;

public class CallbackType {


    public void run(Runnable runnable){
        System.out.println("앞 동작");
        runnable.run();
        System.out.println("뒤 동작");
    }
}
