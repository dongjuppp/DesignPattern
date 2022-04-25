package abstractFactory;

public class HyundaiCarPartsFactory implements CarPartsFactory {

    @Override
    public Wheel createWheel() {
        return new HyundaiWheel();
    }

    @Override
    public Handle createHandle() {
        return new HyundaiHandle();
    }
}
