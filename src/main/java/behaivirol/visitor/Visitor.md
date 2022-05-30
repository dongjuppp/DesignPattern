비지터 패턴
==

1. 기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법.
2. 추가 기능을 한 곳에 모아둘 수 있다.
3. 새로운 Element를 추가하거나 제거할 때 모든 Visitor 코드를 변경해야 한다


<br>

추가할 기능들이 정의된 인터페이스 

```java
public interface Device {

    void print(Circle circle);
    
    void print(Rectangle rectangle);
}
```

<br> 

추가된 기능들을 직접 구현한 클래스 즉, 비지터 코드

```java
public class Pad implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Pad Circle");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Pad Rectangle");
    }
}


public class Phone implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Phone Circle");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Phone Rectangle");
    }
}

```

<br>

각 기능들을 구분할 타입 

```java
public class Circle{

  
}

public class Rectangle{

  
}
```