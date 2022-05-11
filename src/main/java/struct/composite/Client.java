package struct.composite;

public class Client {

    public void main(){
        Girl yezi = new Girl();
        yezi.setName("예지");
        Girl taeyeon = new Girl();
        taeyeon.setName("태연");

        Group group = new Group();
        group.addMember(yezi);
        group.addMember(taeyeon);


        doDance(yezi);
        doDance(taeyeon);
        doDance(group);
    }

    private void doDance(Composite composite){
        composite.dance();
    }
}
