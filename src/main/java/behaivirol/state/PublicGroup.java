package behaivirol.state;

import java.util.ArrayList;
import java.util.List;

public class PublicGroup implements GirlGroup {

    private List<String> idols = new ArrayList<>();


    @Override
    public void addMember(String name) {
        throw new UnsupportedOperationException("이미 데뷔해서 추가 불가");
    }

    @Override
    public void dance() {
        idols.forEach(idol -> {
            System.out.println(idol+ "춤춘다");
        });
    }

    @Override
    public List<String> getMembers() {
        return this.idols;
    }
}
