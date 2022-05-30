package behaivirol.template;

public class ConcreteClass extends TemplateClass {

    @Override
    public void doFirst() {
        System.out.println("첫번째!");
    }

    @Override
    public void doSecond() {
        System.out.println("두번째!");
    }
}
