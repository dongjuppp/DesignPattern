package create.factory;

public class RedVelvetFactory extends DefaultFactory {


    public Idol getIdol() {
        return new RedVelvet();
    }
}
