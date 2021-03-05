package creational.abstractFactory;

public class Test {

    public void run(){
        AbFactory factory=getFactory("samsung");

        Phone phone=factory.createPhone();
        Computer computer=factory.createComputer();

        System.out.println(phone.getName());
        System.out.println(computer.getName());
    }

    static AbFactory getFactory(String factory){
        if(factory.equals("samsung")) return new Samsung();
        else return new Lg();
    }
}
