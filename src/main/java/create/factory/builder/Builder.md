빌더 패턴
===

다양한 구성(복잡한 구성)을 가진 인스턴스를 동일한 프로세스로 생성하는 방법

1. 구성요소들의 필수 요소를 지정할 수 있음
2. 생성자를 통해서 생성시, 아규먼트의 순서에서 오는 문제(String만 연속이면 뭐가 뭔지 모름)을 해결 가능
3. 불완전한 클래스를 못 만들게 할 수 있다(마지막에 실제 인스턴스 생성부에서 입력받는 값들의 검증을 진행)
4. 3번에 이어서 동일한 객체도 검증 방식을 달리할 수 있다(아래 인터페이스를 둔 이유가 이것, 인터페이스 구현체의 인스턴스 생성부분(build 메소드)를 각기 다르게 구현하여 검증을 다리게 할 수 있다.)


<br>

타겟 클래스
```java
public class TourPlan {

    private String title;

    private LocalDate startDate;

    private int day;

    private int night;
}
```

빌더 인터페이스
```java
public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder dayAndNight(int day, int night);

    TourPlanBuilder start(LocalDate start);

    TourPlan build();
}
```

빌더 구체 클래스
```java
public class MyTourBuilder implements TourPlanBuilder {

    private String title;

    private int day;

    private int night;

    private LocalDate start;

    private MyTourBuilder(){}

    public static MyTourBuilder create.factory.builder(){
        return new MyTourBuilder();
    }


    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder dayAndNight(int day, int night) {
        this.day = day;
        this.night = night;
        return this;
    }

    @Override
    public TourPlanBuilder start(LocalDate start) {
        this.start = start;
        return this;
    }

    @Override
    public TourPlan build() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle(title);
        tourPlan.setDay(day);
        tourPlan.setNight(night);
        tourPlan.setStartDate(start);
        return tourPlan;
    }
}
```
 