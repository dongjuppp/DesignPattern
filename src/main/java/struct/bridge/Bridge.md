브릿지 패턴
===

1. 계층구조로 나눌때 주로사용
2. 추상적인 것과 구체적인 것을 분리하여 연결
3. 추상코드와 구현체간 서로 변경에 대해 분리가 되어있음
4. 계층 구조가 복잡해 질 수 있음
5. 대표적으로 JDBC의 DriverManager는 실제 구현체(Mysql, H2)들을 포함(연결)하는 추상 클래스로 사용, 그렇기 때문에 DriverManager를 사용하는 클라이언트의 코드는 Mysql,이던 H2던 상관이 없어짐

<br>

연결을 위한 추상 클래스, 내부에 연결할 계층들
```java
public abstract  class Unit {
    private Skill skill;
    private Skin skin;

    public void setSkill(Skill skill){
        this.skill = skill;
    }

    public void setSkine(Skin skin){
        this.skin = skin;
    }
    
    public void action(){
        skin.print();
        skill.execute();
    }
}
```

추상클래스의 구현체
```java
public class ScvUnit extends Unit {


}
```

실제 사용
```java
public class Main {

    public void main(){
        Unit scv = new ScvUnit();
        scv.setSkill(new ScvSkill());
        scv.setSkine(new ScvSkin());

        Unit marine = new MarineUnit();
        marine.setSkill(new MarineSkiil());
        marine.setSkine(new ScvSkin());

    }
}
```

실제 사용은 Unit이라는 추상클래스만 이용한다.
<br>
그리고 실제 동작에 영향을 미치는 부분은 외부에서 new 부분으로 의존성을 주입하여 사용한다.
