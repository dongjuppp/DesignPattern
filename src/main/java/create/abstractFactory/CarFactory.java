package create.abstractFactory;

public class CarFactory {

    private CarPartsFactory carPartsFactory;


    public CarFactory(CarPartsFactory carPartsFactory){
        this.carPartsFactory = carPartsFactory;
    }


    public void makeCar(){
        Car car = new Car();

        car.setHandle(carPartsFactory.createHandle());
        car.setWheel(carPartsFactory.createWheel());
    }
}
