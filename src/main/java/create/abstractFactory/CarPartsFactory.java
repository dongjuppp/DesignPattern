package create.abstractFactory;


public interface CarPartsFactory {

    Wheel createWheel();

    Handle createHandle();
}
