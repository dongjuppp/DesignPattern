package struct.decorator;

public class ActorIdolService extends IdolDecorator {

    public ActorIdolService(IdolService idolService) {
        super(idolService);
    }


    @Override
    public void doAction(String name) {
        super.doAction(name);
        System.out.println(name+" 연기한다");
    }
}
