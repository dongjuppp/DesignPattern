package behaivirol.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<Subscripter>> observer= new HashMap<>();


    public void subscript(String subject, Subscripter subscripter){
        if(observer.containsKey(subject)){
            observer.get(subject).add(subscripter);
        }
        else{
            List<Subscripter> subscripters = new ArrayList<>();
            subscripters.add(subscripter);
            observer.put(subject, subscripters);
        }
    }

    public void unSubscript(String subject, Subscripter subscripter){
        if(observer.containsKey(subject)){
            observer.get(subject).remove(subscripter);
        }
    }

    public void sendMessage(User user, String subject, String message){
        if(observer.containsKey(subject)){
            observer.get(subject).forEach(s -> s.sendMassage(user.getName()+" "+message));
        }
    }
}
