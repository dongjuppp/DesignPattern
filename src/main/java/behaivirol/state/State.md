상태 패턴
==

1. 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 패턴.
2. 상태에 특화된 행동들을 분리해 낼 수 있으며, 새로운 행동을 추가하더라도 다른 행동에 영
   향을 주지 않는다

<br>

상태에 해당하는 인터페이스
```java
public interface GirlGroup {

    void addMember(String name);

    void dance();
    
    List<String> getMembers();
}
```


<br>
구체적인 상태를 지니고 있는 클래스

```java
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
```

```java
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
```