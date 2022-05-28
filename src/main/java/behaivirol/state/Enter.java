package behaivirol.state;

import java.util.ArrayList;
import java.util.List;

public class Enter {

    private GirlGroup girlGroup = new DraftGroup();



    public void addMember(String name){
        girlGroup.addMember(name);
    }


    public void dance(){
        girlGroup.dance();
    }

    public void chnageState(){
        if(girlGroup instanceof DraftGroup){
            List<String> tmp = girlGroup.getMembers();
            this.girlGroup = new PublicGroup();
            tmp.forEach(name ->{
                this.girlGroup.addMember(name);
            });
        }
    }
}
