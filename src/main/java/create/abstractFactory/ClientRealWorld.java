package create.abstractFactory;

public class ClientRealWorld {



    public void live(){
        CarFactory hyundaiFactory = new CarFactory(new HyundaiCarPartsFactory());

        hyundaiFactory.makeCar();

        CarFactory kiaFactory = new CarFactory(new KiaCarPartsFactory());

        kiaFactory.makeCar();
    }
}
