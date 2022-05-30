package behaivirol.visitor;

public class Client {

    public static void main(String[] args) {


        Device phone = new Phone();

        phone.print(new Circle());
    }
}
