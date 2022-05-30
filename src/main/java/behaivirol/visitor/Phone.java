package behaivirol.visitor;

public class Phone implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Phone Circle");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Phone Rectangle");
    }
}
