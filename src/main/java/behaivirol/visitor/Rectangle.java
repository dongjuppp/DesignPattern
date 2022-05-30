package behaivirol.visitor;

public class Rectangle implements Shape {

    @Override
    public void print(Device device) {
        device.print(this);
    }
}
