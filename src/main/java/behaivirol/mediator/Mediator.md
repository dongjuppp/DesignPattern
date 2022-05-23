미디에이터 패턴
==

1. 여러 객체들이 소통하는 방법을 캡슐화하는 패턴.
2. 여러 컴포넌트간의 결합도를 중재자를 통해 낮출 수 있다
3. 중요한건 각 미디에이터에서 컴포넌트한테 다른 컴포넌트를 넘겨줘서는 안됌, 그러면 직접 통신과 같아짐
4. 단점은 중재자 역할을 하는 클래스의 복잡도와 결합도가 증가한다

총 3개의 객체

<br>

```java
public class GirlGroup {
    
    private String name = "Twice";
    
    private int money = 3000;
    
    public String getName(){
        return name;
    }
    
    public void getMoney(int money){
        this.money += money;
    }
}

public class Entertainment {
    
    private String groupName;
    
    private int number;
    
    private int salary;
    
    public void addGroup(int number, String name){
        groupName = name;
        this.number = number;
    }
    
    public int getSalary(){
        return salary * number;
    }
}


public class Broad {
    
    public void tvShow(String name, int money){
        
    }
}
```

<br>

각 클래스간의 호출을 미디에이터에서 모두 처리 
```java
public class Mediator {

    private GirlGroup group = new GirlGroup();

    private Entertainment entertainment = new Entertainment();

    private Broad broad = new Broad();


    public void joinCompany(int numberOfMember){
        entertainment.addGroup(numberOfMember, group.getName());
    }

    public void payMoney(){
        group.getMoney(entertainment.getSalary());
    }
    
    public void broad(){
        broad.tvShow(group.getName(), entertainment.getSalary());
    }
}
```