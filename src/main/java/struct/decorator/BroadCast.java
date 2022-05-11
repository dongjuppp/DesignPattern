package struct.decorator;

public class BroadCast {

    private static boolean isDancer = true;

    private static boolean isActor = false;

    private IdolService idolService = new DefaultIdolService();

    // 데코레이터 조합
    public void setting() {

        IdolService idolService = new DefaultIdolService();


        if(isDancer){
            idolService = new DanceIdolService(idolService);
        }

        if(isActor){
            idolService = new ActorIdolService(idolService);
        }

    }

    // 이부분만 클라이언트
    public void client(){
        idolService.doAction("IU");
        // 이부분은 수정이 필요없지만 위 데코레이터를 통해 동작을 조합할 수 있다
    }


}
