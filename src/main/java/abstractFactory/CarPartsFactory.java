package abstractFactory;


public interface CarPartsFactory {

    Wheel createWheel();

    Handle createHandle();
}