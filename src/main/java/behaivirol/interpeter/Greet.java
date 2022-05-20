package behaivirol.interpeter;

public class Greet {

    public void greet(String info){
        MentVo mentVo = InfoInterpreter.parsingInfo(info);

        System.out.println(mentVo.getFirstName()+" "+mentVo.getLastName()+" "+mentVo.getMent());
    }
}
