package behaivirol.mediator;

public class Mediator {

    private GirlGroup group = new GirlGroup();

    private Entertainment entertainment = new Entertainment();

    private Broad broad = new Broad();


    public void joinCompany(int numberOfMember){
        entertainment.addGroup(numberOfMember, group.getName());
    }

    public void payMoney(){
        group.getMoney(entertainment.getSalary());
    }

    public void broad(){
        broad.tvShow(group.getName(), entertainment.getSalary());
    }
}
