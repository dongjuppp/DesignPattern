package behaivirol.state;

import java.util.ArrayList;
import java.util.List;

public class DraftGroup implements GirlGroup {

    private List<String> idols = new ArrayList<>();



    @Override
    public void addMember(String name) {
        idols.add(name);
    }

    @Override
    public void dance() {
        throw new UnsupportedOperationException("데뷔전이라 방송 불가");
    }

    @Override
    public List<String> getMembers() {
        return this.idols;
    }
}
