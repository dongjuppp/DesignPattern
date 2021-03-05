package creational.abstractFactory;

public class Samsung implements AbFactory {

    public Phone createPhone() {
        return new SamsungPhone();
    }

    public Computer createComputer() {
        return new SamsungComputer();
    }
}
