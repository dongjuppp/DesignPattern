package factory;

public class Client {

    public static void main(String[] args) {
        IdolFactory factory = new RedVelvetFactory();

        Idol idol = factory.createIdol("Itzy",5);

        System.out.println(idol.getGroupName() + " 데뷔!");
    }
}
