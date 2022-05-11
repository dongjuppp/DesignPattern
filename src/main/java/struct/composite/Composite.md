컴포짓 패턴
====

1. 객체들이 트리구조로 되어있을 때 클라이언트에서는 트리의 어느 부분을 사용하는지 몰라도 이용가능하게 하는 패턴
2. 트리에 뭔가 추가되도 동일하게 다루니 OCP가 지켜짐
3. 단, 트리들이 모두 동일한 인터페이스를 두다보니 억지로 일반화를 해야함


최하위 
```java
public class Girl implements Composite {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println(name+" 춤춘다");
    }
}
```
<br>

최상위
```java
public class Group implements Composite {

    private List<Composite> members = new ArrayList<>();

    public void addMember(Composite composite){
        members.add(composite);
    }

    @Override
    public void dance() {

    }
}
```
<br>

클라이언트 사용부 
```java
public class Client {

    public void main(){
        Girl yezi = new Girl();
        yezi.setName("예지");
        Girl taeyeon = new Girl();
        taeyeon.setName("태연");

        Group group = new Group();
        group.addMember(yezi);
        group.addMember(taeyeon);


        doDance(yezi);
        doDance(taeyeon);
        doDance(group);
    }

    private void doDance(Composite composite){
        composite.dance();
    }
}
```