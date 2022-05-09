package create.factory.abstractFactory;


public interface CarPartsFactory {

    Wheel createWheel();

    Handle createHandle();
}
