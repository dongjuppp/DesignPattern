package create.factory.abstractFactory;

public class KiaCarPartsFactory implements CarPartsFactory {

    @Override
    public Wheel createWheel() {

        return new KiaWheel();
    }

    @Override
    public Handle createHandle() {
        return new KiaHandle();
    }
}
