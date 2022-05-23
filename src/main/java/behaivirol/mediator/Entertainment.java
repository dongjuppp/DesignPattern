package behaivirol.mediator;

public class Entertainment {

    private String groupName;

    private int number;

    private int salary;

    public void addGroup(int number, String name){
        groupName = name;
        this.number = number;
    }

    public int getSalary(){
        return salary * number;
    }
}
