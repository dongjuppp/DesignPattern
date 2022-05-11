package struct.composite;

public class Girl implements Composite {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println(name+" 춤춘다");
    }
}
