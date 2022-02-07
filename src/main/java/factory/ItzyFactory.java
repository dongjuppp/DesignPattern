package factory;

public class ItzyFactory extends DefaultFactory {


    public Idol getIdol() {
        return new Itzy();
    }
}
