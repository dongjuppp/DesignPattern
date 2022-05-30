package behaivirol.visitor;

public class Circle implements Shape{

    @Override
    public void print(Device device) {
        device.print(this);
    }
}
