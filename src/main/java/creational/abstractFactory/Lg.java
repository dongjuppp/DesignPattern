package creational.abstractFactory;

public class Lg implements AbFactory {

    public Phone createPhone() {
        return new LgPhone();
    }

    public Computer createComputer() {
        return new LgComputer();
    }
}
