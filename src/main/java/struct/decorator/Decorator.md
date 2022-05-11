데코레이터 패턴
====

1. 기존 코드를 수정하지 않고 추가 기능을 추가하는 패턴
2. 데코레이터를 통해 기능들을 조합하는 것이 가능하다


```java
public interface IdolService {

    void doAction(String name);
}
```

<br>
이 클래스를 상속 받는 것들이 구체 기능을 하는 클래스들이 된다. 

```java
public class IdolDecorator implements IdolService {

    private IdolService idolService;


    public IdolDecorator(IdolService idolService) {
        this.idolService = idolService;
    }

    @Override
    public void doAction(String name) {
        idolService.doAction(name);
    }
}
```

<br>
구체 클래스 1

```java
public class DanceIdolService extends IdolDecorator {

    public DanceIdolService(IdolService idolService) {
        super(idolService);
    }

    @Override
    public void doAction(String name) {
        super.doAction(name);
        System.out.println(name+" 춤춘다");
    }
}
```

<br>
구체 클래스 2

```java
public class ActorIdolService extends IdolDecorator {

    public ActorIdolService(IdolService idolService) {
        super(idolService);
    }


    @Override
    public void doAction(String name) {
        super.doAction(name);
        System.out.println(name+" 연기한다");
    }
}
```

<br>
데코레이터 조합과, 클라이언트 사용부분

```java
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
```