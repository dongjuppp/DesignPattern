package creational.factoryMethod;

public class Test {

    public static void run(){
        PhoneFactory factory=new PhoneFactory();

        Product product=factory.create("creational.factoryMethod.PhoneProduct");

        product.use();
    }
}
