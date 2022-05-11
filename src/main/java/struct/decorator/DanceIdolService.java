package struct.decorator;

public class DanceIdolService extends IdolDecorator {

    public DanceIdolService(IdolService idolService) {
        super(idolService);
    }

    @Override
    public void doAction(String name) {
        super.doAction(name);
        System.out.println(name+" 춤춘다");
    }
}
