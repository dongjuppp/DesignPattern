package behaivirol.mediator;

public class GirlGroup {

    private String name = "Twice";

    private int money = 3000;

    public String getName(){
        return name;
    }

    public void getMoney(int money){
        this.money += money;
    }
}
