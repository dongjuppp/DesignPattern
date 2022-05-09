package struct.bridge;

public class Main {

    public void main(){
        Unit scv = new ScvUnit();
        scv.setSkill(new ScvSkill());
        scv.setSkine(new ScvSkin());

        Unit marine = new MarineUnit();
        marine.setSkill(new MarineSkiil());
        marine.setSkine(new ScvSkin());

    }
}
