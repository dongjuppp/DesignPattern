package struct.decorator;

public class DefaultIdolService implements IdolService{

    @Override
    public void doAction(String name) {
        System.out.println(name+" 춤춘다");
    }
}
