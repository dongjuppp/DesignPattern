package struct.decorator;

public class IdolDecorator implements IdolService {

    private IdolService idolService;


    public IdolDecorator(IdolService idolService) {
        this.idolService = idolService;
    }

    @Override
    public void doAction(String name) {
        idolService.doAction(name);
    }
}
