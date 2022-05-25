package behaivirol.observer;

public class User implements Subscripter{

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public void sendMassage(String message) {
        System.out.println(name+" "+message);
    }
}
