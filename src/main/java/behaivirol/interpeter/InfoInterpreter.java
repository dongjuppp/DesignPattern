package behaivirol.interpeter;

public class InfoInterpreter {

    public static MentVo parsingInfo(String ment){
        String[] arr = ment.split("\\.");

        MentVo mentVo = new MentVo();
        mentVo.setFirstName(arr[0]);
        mentVo.setLastName(arr[1]);
        mentVo.setMent(arr[2]);

        return mentVo;
    }
}
