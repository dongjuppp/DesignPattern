package behaivirol.visitor;

public class Pad implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Pad Circle");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Pad Rectangle");
    }
}
