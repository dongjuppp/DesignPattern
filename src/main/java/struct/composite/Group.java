package struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Composite {

    private List<Composite> members = new ArrayList<>();

    public void addMember(Composite composite){
        members.add(composite);
    }

    @Override
    public void dance() {

    }
}
