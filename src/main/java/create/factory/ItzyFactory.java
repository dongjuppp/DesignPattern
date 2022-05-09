package create.factory;

public class ItzyFactory extends DefaultFactory {


    public Idol getIdol() {
        return new Itzy();
    }
}
