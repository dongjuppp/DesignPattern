package behaivirol.template;

public abstract class TemplateClass {

    public void process(){
        doFirst();
        doSecond();
    }


    protected abstract void doFirst();

    protected abstract void doSecond();
}
